package units

import common.AppUnit
import common.Strings.*

class Archive(override val name: String) : AppUnit<Note>() {

    override fun add() {
        println(INPUT_NOTE_NAME)
        var nameOfNote = checkContent()

        println(INPUT_NOTE_CONTENT)
        val contentOfNote = checkContent()

        content.add(Note(nameOfNote, mutableListOf(contentOfNote)))
    }

}