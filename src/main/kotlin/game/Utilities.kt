package org.chuong.game

fun processNumberInput(default: Int = Int.MIN_VALUE): Int {
    val input = readlnOrNull() ?: default.toString()

    val parsedInput =
        try {
            input.toInt()
        } catch (_: NumberFormatException) {
            default
        }

    return parsedInput
}

fun processStringInput(default: String = "You"): String {
    val input = readlnOrNull() ?: default

    val parsedInput =
        input.replaceFirstChar { c ->
            c.uppercase()
        }

    return parsedInput
}
