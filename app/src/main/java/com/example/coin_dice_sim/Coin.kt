package com.example.coin_dice_sim

import kotlin.random.Random

class Coin : RollingTool {
    override fun roll() {
        var r = Random.nextBoolean()
        when (r) {
            true -> println("Heads")
            false -> println("Tails")
        }
    }
}