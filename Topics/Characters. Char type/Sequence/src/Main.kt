fun main() {
    val a: Char = readln().first()
    val b: Char = readln().first()
    val c: Char = readln().first()

    println(a == b - 1 && b == c - 1)
}