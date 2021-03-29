/*
 * Use of this source code is governed by the MIT license that can be
 * found in the LICENSE file.
 */

package org.rust.cargo.toolchain.wsl.flavors

import com.intellij.util.io.isDirectory
import org.rust.cargo.toolchain.tools.Rustup
import org.rust.cargo.toolchain.wsl.expandUserHome
import org.rust.cargo.toolchain.wsl.fetchInstalledWslDistributions
import org.rust.stdext.toPath
import java.nio.file.Path

class RsWslRustupToolchainFlavor : RsWslToolchainFlavor() {

    @Suppress("UnstableApiUsage")
    override fun getHomePathCandidates(): List<Path> {
        val paths = mutableListOf<Path>()
        for (distro in fetchInstalledWslDistributions()) {
            // BACKCOMPAT: 2020.3
            // Replace with `distro.uncRootPath`
            val root = distro.uncRoot.path.toPath()
            val remoteCargoPath = distro.expandUserHome("~/.cargo/bin")
            val localCargoPath = root.resolve(remoteCargoPath)
            if (!localCargoPath.isDirectory()) continue
            paths.add(localCargoPath)
        }
        return paths
    }

    override fun isValidToolchainPath(path: Path): Boolean =
        super.isValidToolchainPath(path) && hasExecutable(path, Rustup.NAME)
}
