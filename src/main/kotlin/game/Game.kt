package org.chuong.game

abstract class Game(name: String) {
    val gameName = name.uppercase()

    fun start() {
        greet()
    }

    fun greet() {
        var loop = true

        while (loop) {
            println("Let's play $gameName! If you need to know how to play, press 'h', otherwise press 's' to start or 'q' to quit.")

            val input = readlnOrNull() ?: ""

            when (input.lowercase()) {
                "h" -> help()
                "s" -> {
                    play()
                    loop = false
                }
                "q" -> {
                    println("Goodbye!")
                    loop = false
                }
                else -> println("I don't understand.")
            }
        }
    }

    abstract fun help()

    abstract fun play()
}
