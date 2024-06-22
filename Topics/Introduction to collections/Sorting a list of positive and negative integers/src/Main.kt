import java.util.*

fun main(args: Array<String>) {
    // Create a mutable list to store the input numbers
    val numberList = mutableListOf<Int>()

    // Use a scanner to read the user input
    val scanner = Scanner(System.`in`)

    // TODO: Extract the integers from the input and add them to the mutable list

    // TODO: Sort the list in ascending order

    // TODO: Iterate through the sorted list and print each number followed by a space.
//    numberList.addAll(scanner.nextLine().split(" ").toInt())
    val input = scanner.nextLine().split(" ")

    for (i in input.indices) {
        numberList.add(input[i].toInt())
    }
    numberList.sort()
    println(numberList.joinToString(" "))
}
