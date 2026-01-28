fun main() {
    //TASK 1
    // Crear 3 variables
    val pez1 = "trout"
    val pez2 = "haddock"
    val pez3 = "snapper"

    // Imprimirlos
    println("Me gusta comer $pez1 y $pez2, pero no me gusta comer $pez3.")

    //TASK 2
    val fishName = "trout"

    when (fishName.length) {
        0 -> println("Error!")
        in 3..12 -> println("Good fish name")
        else -> println("OK fish name")
    }
}