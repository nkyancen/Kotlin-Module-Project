package common

import units.Note
import common.Strings.*

interface MenuInterface<T : AppUnit<S>, S : AppUnit<Note>> : Checking {
    private fun getUserNumber(menu: AppMenu<T, S>): Int {
        return try {
            checkContent().toInt()
        } catch (e: Exception) {
            println(HAS_INCORRECT_INPUT)
            menu.showMenu()
            getUserNumber(menu)
        }
    }

    fun analyseNumber(menu: AppMenu<T, S>): Int {
        val userNumber = getUserNumber(menu)
        return if (userNumber < menu.content.size && userNumber >= 0) {
            userNumber
        } else {
            println(HAS_INCORRECT_ITEM)
            menu.showMenu()
            analyseNumber(menu)
        }
    }
}