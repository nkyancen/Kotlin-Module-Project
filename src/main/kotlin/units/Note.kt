package units

import common.AppUnit
import java.util.Scanner

class Note(
    override val name: String,
    val contentOfNote: MutableList<String>
) : AppUnit<Note>(name) {

    override fun add() {
        println("Введите текстовую строку:")
        contentOfNote.add(Scanner(System.`in`).nextLine())
    }
}