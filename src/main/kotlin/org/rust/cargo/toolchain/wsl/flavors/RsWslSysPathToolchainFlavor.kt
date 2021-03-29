/*
 * Use of this source code is governed by the MIT license that can be
 * found in the LICENSE file.
 */

package org.rust.cargo.toolchain.wsl.flavors

import com.intellij.util.io.isDirectory
import org.rust.cargo.toolchain.wsl.fetchEnvironmentVariable
import org.rust.cargo.toolchain.wsl.fetchInstalledWslDistributions
import org.rust.stdext.toPath
import java.nio.file.Path

class RsWslSysPathToolchainFlavor : RsWslToolchainFlavor() {
    @Suppress("UnstableApiUsage")
    override fun getHomePathCandidates(): List<Path> {
        val paths = mutableListOf<Path>()
        for (distro in fetchInstalledWslDistributions()) {
            val sysPath = distro.fetchEnvironmentVariable("PATH") ?: continue
            // BACKCOMPAT: 2020.3
            // Replace with `distro.uncRootPath`
            val root = distro.uncRoot.path.toPath()
            for (remotePath in sysPath.split(":")) {
                if (remotePath.isEmpty()) continue
                val localPath = root.resolve(remotePath)
                if (!localPath.isDirectory()) continue
                paths.add(localPath)
            }
        }
        return paths
    }
}
