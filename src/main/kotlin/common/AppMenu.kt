package common

import menus.*
import units.*

open class AppMenu<T : AppUnit<S>, S : AppUnit<Note>>(val t: T) : MenuInterface<T, S> {

    var isExit = false
    val content = mutableListOf("Выход", "Создать ")

    init {
        t.content.forEach { line -> content.add(line.name) }
    }

    fun start() {
        while (!isExit) {
            showMenu()
            println("Выберите пункт меню:")
            chooseMenuItem(analyseNumber(this))
        }
    }

    fun chooseMenuItem(userInput: Int) {
        when (userInput) {
            0 -> isExit = true

            1 -> addContent()

            else -> chooseMenuDown(userInput)
        }
    }

    fun addContent() {
        t.add()
        if (t !is Note) {
            content.add(t.content[t.content.lastIndex].name)
        }
    }

    fun chooseMenuDown(userInput: Int) {
        when (t) {
            is Directory -> ArchiveMenu(t.content[userInput - 2]).start()
            is Archive -> NoteMenu(t.content[userInput - 2]).start()
        }
    }

    fun showMenu() {
        println("-------------")
        if (t.name != "") {
            println("Имя: ${t.name}")
        }
        if (t is Note) {
            println("Содержание заметки:")
            t.contentOfNote.forEach { line -> println(line) }
            println("------------")
        }
        content.forEachIndexed { index, value -> println("${index}. $value") }
    }
}