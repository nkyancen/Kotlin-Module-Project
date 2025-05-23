package menus

import common.AppMenu
import units.Note

class NoteMenu(note: Note) : AppMenu<Note, Note>(note) {

    init {
        content[1] = "Добавить текст заметки"
    }
}