fun main() {
    //TASK 1
    // lambda para el dado que retorne un numero del 1 al 12 y con numeros de lados como argumento
    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0 else (1..sides).random()
    }

    //TASK 2
    // toma el dado creado como argumento y imprime el resultado
    gamePlay(rollDice2)

}

fun gamePlay(roll: (Int) -> Int) {
    val diceRoll = roll(12)
    println("You rolled: $diceRoll")
}
