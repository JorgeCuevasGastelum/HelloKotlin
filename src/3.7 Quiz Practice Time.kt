fun main() {

    //loop, se termina al recorrerlo 10 veces o al obtener el texto "take it easy"
    for (i in 1..10) {
        val fortune = getFortuneCookie()
        println("Tu galleta es: $fortune")

        if (fortune.contains("Take it easy")) {
            break
        }
    }
}

//funcion principal
fun getFortuneCookie(): String {

    //lista de textos
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    print("Enter your birthday: ")

    val birthday = readLine()?.toIntOrNull() ?: 1

    //regresa el indice segun el numero obtenido dividido por el numero de textos
    return fortunes[birthday % fortunes.size]
}
