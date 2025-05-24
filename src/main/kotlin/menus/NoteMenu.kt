package menus

import common.AppMenu
import common.Strings.ADD_TEXT_TO_NOTE
import units.Note

class NoteMenu(note: Note) : AppMenu<Note, Note>(note) {

    init {
        content[1] = "$ADD_TEXT_TO_NOTE"
    }
}