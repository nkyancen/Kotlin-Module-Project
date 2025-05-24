package common

enum class Strings(val msg: String) {
    HAS_INCORRECT_INPUT ("Некорректный ввод! Введите целое число из диапазона"),
    HAS_INCORRECT_ITEM("Такого элемента нет в меню! Введите целое число из диапазона"),
    HAS_EMPTY_INPUT("Ввод не должен быть пустым! Повторите ввод."),

    CHOSE_MENU_ITEM("Выберите пункт меню:"),
    CREATE_ARCHIVE("Создать архив"),
    CREATE_NOTE("Создать заметку"),
    SHOW_NAME("Имя:"),

    INPUT_TEXT_TO_NOTE("Введите текстовую строку для дополнения заметки:"),
    INPUT_ARCHIVE_NAME("Введите имя архива:"),
    INPUT_NOTE_NAME("Введите название заметки:"),
    INPUT_NOTE_CONTENT("Введите текст заметки:"),

    ADD_TEXT_TO_NOTE("Дополнить текст заметки"),
    SHOW_CONTENT_OF_NOTE("Содержание заметки:"),

    SHOW_FILLER("-------------"),
    SHOW_EMPTY(""),

    EXIT("Выход");

    override fun toString(): String {
        return msg
    }
}