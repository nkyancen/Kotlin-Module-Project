package common

import units.Note

interface MenuInterface<T : AppUnit<S>, S : AppUnit<Note>> : Checking {
    private fun getUserNumber(menu: AppMenu<T, S>): Int {
        return try {
            checkContent().toInt()
        } catch (e: Exception) {
            println("Некорректный ввод! Введите число")
            menu.showMenu()
            getUserNumber(menu)
        }
    }

    fun analyseNumber(menu: AppMenu<T, S>): Int {
        val userNumber = getUserNumber(menu)
        return if (userNumber < menu.content.size) {
            userNumber
        } else {
            println("Такого элемента нет в меню")
            menu.showMenu()
            analyseNumber(menu)
        }
    }
}