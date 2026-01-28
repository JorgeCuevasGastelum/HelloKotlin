import java.util.Calendar

// funcion para saber el dia de la semana
fun dayOfWeek() {
    // pregunta
    println("What day is it today?")

    // obtener dia actual con la libreria calendar
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    // condicional when para asignar el string del dia segun el numero
    val dayName = when (day) {
        1 -> "Domingo"
        2 -> "Lunes"
        3 -> "Martes"
        4 -> "Miercoles"
        5 -> "Jueves"
        6 -> "Viernes"
        7 -> "Sabado"
        else -> "null"
    }

    //imprimir
    println(dayName)
}

fun main(args: Array<String>) {
    dayOfWeek()
}