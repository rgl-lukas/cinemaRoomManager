const val PI = 3.14

fun main() {
    val type = readln()

    println(when (type) {
        "triangle" -> {
            val a = readln().toDouble()
            val b = readln().toDouble()
            val c = readln().toDouble()
            val s = (a + b + c) / 2
            kotlin.math.sqrt(s * (s - a) * (s - b) * (s - c))
        }
        "rectangle" -> {
            val a = readln().toDouble()
            val b = readln().toDouble()
            a * b
        }
        "circle" -> {
            val r = readln().toDouble()
            PI * r * r
        }
        else -> "Wrong type!"
    }
    )
}