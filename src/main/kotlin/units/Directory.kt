package units

import common.AppUnit

class Directory() : AppUnit<Archive>("") {

    override fun add() {
        println("Введите имя архива:")
        var nameOfArchive = checkContent()

        content.add(Archive(nameOfArchive))
    }


}