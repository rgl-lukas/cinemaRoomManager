fun main() {  
    val beyondTheWall = readln().split(", ").map { it }.toMutableList()
    val backToTheWall = readln().split(", ").map { it }.toMutableList()
    // do not touch the lines above
    // write your code here
    println(beyondTheWall.sorted() == backToTheWall.sorted())

}