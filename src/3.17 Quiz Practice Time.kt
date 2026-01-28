fun main() {

    //lista inicial
    val spices = listOf(
        "curry", "pepper", "cayenne", "ginger",
        "red curry", "green curry", "red pepper"
    )

    // filtrar curry
    val curries = spices
        .filter { it.contains("curry") }
        .sortedBy { it.length }

    println(curries)

    //filtrar empiezan con c y terminan con e
    val cAndE2 = spices
        .filter { it.startsWith('c') }
        .filter { it.endsWith('e') }

    println(cAndE2)

    //filtrar los primeros 3 que inicien con c
    val firstThreeC = spices
        .take(3)
        .filter { it.startsWith('c') }

    println(firstThreeC)





}
