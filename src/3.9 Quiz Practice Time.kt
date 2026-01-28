//IGUAL QUE EL ANTERIOR SIMPLEMENTE SEPARE FUNCIONALIDADES
// ahora se utiliza repeat
fun main() {
    repeat(10) {
        val fortune = getFortune(getBirthday())
        println("Your fortune is: $fortune")
    }
}


fun getBirthday(): Int {
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}

fun getFortune(birthday: Int): String {

    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    return when {
        birthday == 28 || birthday == 31 ->
            "Be humble and all will turn out well."

        birthday in 1..7 ->
            "Things will go well for you today."

        else ->
            fortunes[birthday % fortunes.size]
    }
}
