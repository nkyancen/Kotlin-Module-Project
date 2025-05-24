import menus.DirectoryMenu
import units.Directory
import java.util.Scanner

val scanner = Scanner(System.`in`)

fun main() {
    val menu = DirectoryMenu(Directory())

    menu.start()
}