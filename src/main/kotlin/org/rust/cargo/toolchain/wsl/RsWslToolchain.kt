/*
 * Use of this source code is governed by the MIT license that can be
 * found in the LICENSE file.
 */

package org.rust.cargo.toolchain.wsl

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.execution.process.ProcessHandler
import com.intellij.execution.wsl.WSLCommandLineOptions
import com.intellij.execution.wsl.WSLDistribution
import com.intellij.openapi.util.io.FileUtil
import com.intellij.util.io.isFile
import com.intellij.util.io.systemIndependentPath
import org.rust.cargo.toolchain.RsToolchain
import org.rust.cargo.toolchain.RsToolchainProvider
import org.rust.stdext.toPath
import java.io.File
import java.nio.file.Path

class RsWslToolchainProvider : RsToolchainProvider {

    // BACKCOMPAT: 2020.3
    // Replace with [WslDistributionManager.isWslPath]
    override fun isApplicable(homePath: Path): Boolean =
        homePath.toString().startsWith(WSLDistribution.UNC_PREFIX)

    override fun getToolchain(homePath: Path): RsToolchain? {
        // BACKCOMPAT: 2020.3
        // Replace with [WslPath.parseWindowsUncPath]
        val (wslPath, distribution) = parseUncPath(homePath) ?: return null
        return RsWslToolchain(wslPath, distribution)
    }
}

class RsWslToolchain(
    private val wslLocation: Path,
    private val distribution: WSLDistribution
) : RsToolchain(distribution.toUncPath(wslLocation)) {

    override val fileSeparator: String = "/"

    override val executionTimeoutInMilliseconds: Int = 5000

    override fun <T : GeneralCommandLine> patchCommandLine(commandLine: T): T {
        val parameters = commandLine.parametersList.list.map { toRemotePath(it) }
        commandLine.parametersList.clearAll()
        commandLine.parametersList.addAll(parameters)

        commandLine.environment.forEach { (k, v) ->
            val paths = v.split(File.pathSeparatorChar)
            commandLine.environment[k] = paths.joinToString(":") { toRemotePath(it) }
        }

        commandLine.workDirectory?.let {
            if (it.path.startsWith(fileSeparator)) {
                commandLine.workDirectory = File(toLocalPath(it.path))
            }
        }

        val remoteWorkDir = commandLine.workDirectory?.absolutePath
            ?.let { toRemotePath(it) }
        val options = WSLCommandLineOptions()
            .setRemoteWorkingDirectory(remoteWorkDir)
            .addInitCommand("export PATH=\"${wslLocation.systemIndependentPath}:\$PATH\"")
        return distribution.patchCommandLine(commandLine, null, options)
    }

    override fun startProcess(commandLine: GeneralCommandLine): ProcessHandler = RsWslProcessHandler(commandLine)

    override fun toLocalPath(remotePath: String): String =
        distribution.getWindowsPath(FileUtil.toSystemIndependentName(remotePath)) ?: remotePath

    private fun toRemotePath(localPath: String): String =
        distribution.getWslPath(localPath) ?: localPath

    fun toUncPath(remotePath: String): String =
        distribution.toUncPath(remotePath.toPath()).toString()

    override fun expandUserHome(remotePath: String): String =
        distribution.expandUserHome(remotePath)

    override fun getExecutableName(toolName: String): String = toolName

    override fun pathToExecutable(toolName: String): Path = wslLocation.pathToExecutable(toolName)

    override fun hasExecutable(exec: String): Boolean =
        toUncPath(pathToExecutable(exec).toString()).toPath().isFile()

    override fun hasCargoExecutable(exec: String): Boolean =
        toUncPath(pathToCargoExecutable(exec).toString()).toPath().isFile()
}
