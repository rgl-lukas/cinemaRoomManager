fun main() {
    val x: Boolean = readlnOrNull().toBoolean() // read other values in the same way
    // write your code here
    val y: Boolean = readlnOrNull().toBoolean()
    val z: Boolean = readlnOrNull().toBoolean()

    println(!(x && y) || z)
}