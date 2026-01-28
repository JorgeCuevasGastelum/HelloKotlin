fun main() {
    // TASK 1
    val fish = 2.plus(71).plus(233).minus(13)
    val aquariums = (fish + 29) / 30
    print("cantidad de peces: " + fish + "\n");
    print("cantidad de aquarios: " + aquariums+ "\n");

    //TASK 2
    var rainbowColor: String = "Red"
    rainbowColor = "Blue"   // se puede cambiar porque es var

    val blackColor: String = "Black"  // val no se puede cambiar

    //TASK 3
    var rainbowColor2: String = "Red" // no se puede poner null ya que es string
    var greenColor: String? = null // aqui ya se puede poner null

    //TASK 4
    // forma 1
    val listWithNulls = listOf(null, null)
    // forma 2
    val listWithNullsAlt = List(2) { null }
    // Aqui definimos que la lista puede ser nula
    val nullList: List<String>? = null

    //TASK 5
    var nullTest: Int? = null

    // Si nullTest no es null, se le suma 1. si es null, el resultado es 0
    val result = (nullTest?.plus(1)) ?: 0
    println("El resultado es: $result")


}