fun main() {
    //4 condiciones diferentes de ejemplo
    println(whatShouldIDoToday("happy"))
    println(whatShouldIDoToday("sad"))
    println(whatShouldIDoToday("happy", "rainy"))
    println(whatShouldIDoToday("happy", "sunny", 30))
}

//funcion que define que hacer hoy segun las condiciones
//ahora manda a llamar a otras funciones dependiendo del contexto para decidir su resultado
fun whatShouldIDoToday(
    mood: String,
    weather: String = "sunny",
    temperature: Int = 24
): String =
    when {
        isFreezingSadRainy(mood, weather, temperature) ->
            "stay in bed"

        isVeryHot(temperature) ->
            "go swimming"

        isCold(temperature) ->
            "stay home and drink something hot"

        isHappySunny(mood, weather) ->
            "go for a walk"

        else ->
            "Stay home and read."
    }

fun isFreezingSadRainy(mood: String, weather: String, temperature: Int) =
    mood == "sad" && weather == "rainy" && temperature == 0

fun isVeryHot(temperature: Int) =
    temperature > 35

fun isCold(temperature: Int) =
    temperature < 10

fun isHappySunny(mood: String, weather: String) =
    mood == "happy" && weather == "sunny"

