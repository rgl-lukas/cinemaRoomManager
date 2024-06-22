import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    // input temperature in Fahrenheit
    val temperature: Int = scan.nextLine().trim().toInt()

    // your code goes here
    val result = if (temperature > 85) "High temperature" else if (temperature < 50) "Low temperature" else "Normal temperature"
    println(result)
}