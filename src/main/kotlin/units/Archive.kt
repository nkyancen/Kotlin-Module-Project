package units

import common.AppUnit

class Archive(override val name: String) : AppUnit<Note>() {

    override fun add() {
        println("Введите название заметки:")
        var nameOfNote = checkContent()

        println("Введите текст заметки:")
        val contentOfNote = checkContent()

        content.add(Note(nameOfNote, mutableListOf(contentOfNote)))
    }

}