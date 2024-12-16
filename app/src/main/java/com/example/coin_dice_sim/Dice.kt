package com.example.coin_dice_sim

import kotlin.random.Random

class Dice : RollingTool {
    override fun roll() {
        var r = Random.nextInt(1, 7)
        if (r == 1) println("Na kostce wypadło ${r} oczko.")
        else if ( 1 < r && r < 5) println("Na kostce wypadły ${r} oczka.")
        else println("Na kostce wypadło ${r} oczek.")
    }
}