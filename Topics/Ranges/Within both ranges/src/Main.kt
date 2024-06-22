fun main() {
    val firstRangeStart = readln().toInt()
    val firstRangeEnd = readln().toInt()
    val secondRangeStart= readln().toInt()
    val secondRangeEnd = readln().toInt()
    val number = readln().toInt()

    println(number in firstRangeStart..firstRangeEnd && number in secondRangeStart..secondRangeEnd)
}