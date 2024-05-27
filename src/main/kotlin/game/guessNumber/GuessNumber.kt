package org.chuong.game.guessNumber

import org.chuong.game.Game
import org.chuong.game.processNumberInput

class GuessNumber : Game("Guess that number") {
    override fun help() {
        println("When prompted, enter a number between 0 and 9. I'll tell you if you are too high or too low.")
    }

    override fun play() {
        val hiddenNumber = (0..9).random()

        var loop = true

        while (loop) {
            println("Choose a number between 0 and 9.")

            val chosenNumber = processNumberInput(Int.MIN_VALUE)

            if (chosenNumber == hiddenNumber) {
                println("Winner!")
                loop = false
            } else if (chosenNumber < hiddenNumber) {
                println("Too low!")
            } else {
                println("Too high!")
            }
        }
    }
}
