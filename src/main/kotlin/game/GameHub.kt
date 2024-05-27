package org.chuong.game

import org.chuong.game.bestDev.BestDev
import org.chuong.game.guessNumber.GuessNumber

class GameHub {
    private val games =
        listOf(
            BestDev(),
            GuessNumber(),
        )

    private fun menu() {
        println("Which game shall we play?")

        games.forEachIndexed { idx, game ->
            println("Press $idx to play ${game.gameName}")
        }
    }

    fun start() {
        var loop = true

        while (loop) {
            menu()

            // Ask for game input
            println("Which game do you want to play?")
            val chosenGame = processNumberInput()

            if (chosenGame > -1 && chosenGame < games.size) {
                games[chosenGame].start()
                loop = false
            } else {
                println("I don't know what game that is.")
                println("Do you want to quit?")

                val input = readlnOrNull() ?: "y"

                when (input.lowercase()) {
                    "y" -> {
                        println("Goodbye!")
                        loop = false
                    }
                }
            }
        }
    }
}
