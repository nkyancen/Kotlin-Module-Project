package common

import java.util.Scanner

interface Checking {

    fun checkContent(): String {
        val input = Scanner(System.`in`).nextLine()
        return if (input.trim() != "" && input.isNotEmpty()) {
            input
        } else {
            println("Ввод не должен быть пустым! Повторите ввод.")
            checkContent()
        }
    }
}