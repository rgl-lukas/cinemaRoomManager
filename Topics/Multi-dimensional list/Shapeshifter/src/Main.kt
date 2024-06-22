fun main() {
    // Do not touch code below
    val inputList: MutableList<MutableList<String>> = mutableListOf()
    val n = readln().toInt()
    for (i in 0 until n) {
        val strings = readln().split(' ').toMutableList()
        inputList.add(strings)
    }
    // write your code here    
    val outputList = buildList<String> {
        add(inputList.last().toString())
        add(inputList.first().toString())
    }.toMutableList()

    println(outputList)
}