fun main(args: Array<String>) {
    println(
        "Good ${if (args.isNotEmpty() && args[0].toInt() < 12) "morning" else "night"}, Kotlin!"
    )
}
