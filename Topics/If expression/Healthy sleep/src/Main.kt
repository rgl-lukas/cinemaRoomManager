fun main() {    
    val a = readln().toInt()
    val b = readln().toInt()
    val h = readln().toInt()

    print(if (h in a..b) "Normal" else if (h > b) "Excess" else "Deficiency")
}