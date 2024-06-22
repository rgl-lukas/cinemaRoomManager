import java.util.*

fun main() {
    // create a scanner object 'read' to read user input
    val read = Scanner(System.`in`)

    // capture the binary string as user input
    val binaryString = read.nextLine()

    // Write your code here to count and print the number of ones (1s) in the binary string
    println(binaryString.count { it == '1' })
}
