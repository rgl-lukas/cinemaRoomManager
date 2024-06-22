fun main(args: Array<String>) {

    // TODO: Get input string line
    // TODO: Use split to create an array
    // TODO: Iterate over array to convert from String to Int and accumulate the sum
    // TODO: Print the sum.

    val (a, b, c) = readln().split(" ")
    println(a.toInt() + b.toInt() + c.toInt())
}