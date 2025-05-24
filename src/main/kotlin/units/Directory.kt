package units

import common.AppUnit
import common.Strings.INPUT_ARCHIVE_NAME

class Directory() : AppUnit<Archive>("") {

    override fun add() {
        println(INPUT_ARCHIVE_NAME)
        var nameOfArchive = checkContent()

        content.add(Archive(nameOfArchive))
    }


}