package com.example.coin_dice_sim

fun main(){
    println("==================================================")
    println("Chcesz rzucić kością, czy monetą?")
    var choice = readln().lowercase()
    val coin = Coin()
    val dice = Dice()
    when (choice) {
        "moneta", "monetą" -> coin.roll()
        "kość", "kością", "kosc", "koscia" -> dice.roll()
        else -> println("Niedobry wybór")
    }
    println("Czy chcesz rzucić jeszcze raz?")
    choice = readln().lowercase()
    if (choice == "tak" || choice == "ok") main()
}