fun main() {
    val n = readln().toInt()
    var a = 0
    var b = 0
    var c = 0
    var d = 0

    repeat(n) {
        val grade = readln().toInt()
        when(grade) {
            2 -> d++
            3 -> c++
            4 -> b++
            5 -> a++
        }
    }
    println("$d $c $b $a")
}