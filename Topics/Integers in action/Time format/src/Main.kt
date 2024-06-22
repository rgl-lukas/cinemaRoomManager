fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // do not change this line

    val hours = totalSeconds % 86400 / 3600
    val minutes = totalSeconds % 86400 % 3600 / 60
    val seconds = totalSeconds % 86400 % 3600 % 60

    println("$hours:$minutes:$seconds")
}