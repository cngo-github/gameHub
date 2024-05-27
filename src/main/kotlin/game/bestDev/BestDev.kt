package org.chuong.game.bestDev

import org.chuong.game.Game
import org.chuong.game.processStringInput

class BestDev : Game("Who wants to be the best developer?") {
    override fun help() {
        println("Enter who wants to be the best developer.")
    }

    override fun play() {
        println("Who wants to be the best developer?")

        var name = processStringInput()
        name =
            if (name == "Me" || name == "You") {
                "You want"
            } else {
                "$name wants"
            }

        println("That's right! $name to be the very best developer. Like no one ever was.")
    }
}
