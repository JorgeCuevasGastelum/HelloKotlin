fun main() {
    //4 condiciones diferentes de ejemplo
    println(whatShouldIDoToday("happy"))
    println(whatShouldIDoToday("sad"))
    println(whatShouldIDoToday("happy", "rainy"))
    println(whatShouldIDoToday("happy", "sunny", 30))
}

//funcion que define que hacer hoy segun las condiciones
fun whatShouldIDoToday(
    mood: String,
    weather: String = "sunny",
    temperature: Int = 24
): String {

    return when {
        mood == "happy" && weather == "sunny" && temperature > 25 ->
            "go swimming"

        mood == "happy" && weather == "sunny" ->
            "go for a walk"

        mood == "sad" && weather == "rainy" ->
            "stay in bed and watch a movie"

        temperature < 10 ->
            "stay home and drink something hot"

        else ->
            "Stay home and read."
    }
}
