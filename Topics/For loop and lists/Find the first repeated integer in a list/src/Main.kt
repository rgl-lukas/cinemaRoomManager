// import required
import java.util.*

fun main(args: Array<String>) {
    // Read input string
    val scanner = Scanner(System.`in`)
    val input = scanner.nextLine()

    // Convert the string to a list of integers
    val numbers = input.split(" ").map { it.toInt() }.toMutableList()

    // Initialize data structures for finding first repeated number

    // TODO: Write a for loop here to find the first repeated integer
    //       If you find it, print the number and break the loop
    //       If no repeated number is found, print -1

    var counter: Int = 0

    for (i in numbers.indices) {
        for (j in 0 until i) {
            if (numbers[i] == numbers[j]) {
                counter++
                print(numbers[i])
                break
            }
        }
    }

    if (counter == 0) println("-1")
}