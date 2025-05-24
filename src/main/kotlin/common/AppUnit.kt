package common

open class AppUnit<T>(open val name: String = "") : Checking {

    open val content = mutableListOf<T>()
    open fun add() {}

}