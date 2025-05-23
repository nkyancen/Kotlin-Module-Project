package menus

import common.AppMenu
import units.Archive
import units.Directory

class DirectoryMenu(directory: Directory) : AppMenu<Directory, Archive>(directory) {

    init {
        content[1] += "архив"
    }
}