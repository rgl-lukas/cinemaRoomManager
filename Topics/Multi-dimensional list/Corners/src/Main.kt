fun main() {
    // Do not touch code below
    val inputList: MutableList<MutableList<String>> = mutableListOf()
    val n = readln().toInt()
    for (i in 0 until n) {
        val strings = readln().split(' ').toMutableList()
        inputList.add(strings)
    }
    // write your code here
    print(inputList[0][0])
    print(" ")
    print(inputList[0][inputList.lastIndex])
    println()
    print(inputList[inputList.lastIndex][0])
    print(" ")
    print(inputList[inputList.lastIndex][inputList.lastIndex])
}