fun getLastDigit(num: Int): Char{
    return num.toString().last()
}
/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}