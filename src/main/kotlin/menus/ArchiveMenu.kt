package menus

import common.AppMenu
import common.Strings.*
import units.Archive
import units.Note

class ArchiveMenu(archive: Archive) : AppMenu<Archive, Note>(archive) {

    init {
        content[1] = "$CREATE_NOTE"
    }
}