package common

import common.Strings.HAS_EMPTY_INPUT
import scanner

interface Checking {

    fun checkContent(): String {
        val input = scanner.nextLine()
        return if (input.trim() != "" && input.isNotEmpty()) {
            input
        } else {
            println(HAS_EMPTY_INPUT)
            checkContent()
        }
    }

}