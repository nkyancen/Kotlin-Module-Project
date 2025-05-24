package units

import common.AppUnit
import scanner
import common.Strings.INPUT_TEXT_TO_NOTE

class Note(
    override val name: String,
    val contentOfNote: MutableList<String>
) : AppUnit<Note>(name) {

    override fun add() {
        println(INPUT_TEXT_TO_NOTE)
        contentOfNote.add(scanner.nextLine())
    }
}