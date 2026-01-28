fun main() {
    // crear arreglo de ints de 11 a 15
    val numbers = intArrayOf(11, 12, 13, 14, 15)

    // crear lista vacia tipo string
    val stringList = mutableListOf<String>()

    // agregar el string del numero a la nueva lsita
    for (number in numbers) {
        stringList.add(number.toString())
    }
    //imprimir
    println(stringList)

    //RETO imprimr solo numeros divisibles entre 7
    val multiples = mutableListOf<Int>()
    for (i in 0..100) {
        if (i % 7 == 0) {
            multiples.add(i)
        }
    }
    println(multiples)
}