import kotlin.math.round

fun main() {
    // Read temperature in Celsius as a double
    val celsius = readln().toDouble()

    // TODO: Convert Celsius to Fahrenheit
    val fahrenheit = (celsius * 9) / 5 + 32

    // Print temperature in Fahrenheit rounded to nearest integer
    println(round(fahrenheit).toInt())
}