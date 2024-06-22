fun main() {
    val companiesNumber = readln().toInt()
    val incomeList = mutableListOf<Int>()
    val taxPercentageList = mutableListOf<Int>()
    var taxAmount = 0
    var biggestTaxAmount = 0
    var biggestTaxPayer = 0

    for (i in 1..companiesNumber) {
        incomeList.add(readln().toInt())
    }

    for (i in 1..companiesNumber) {
        taxPercentageList.add(readln().toInt())
    }

    for (i in 0 until companiesNumber) {
        taxAmount = incomeList[i] * taxPercentageList[i]
        if (taxAmount > biggestTaxAmount) {
            biggestTaxAmount = taxAmount
            biggestTaxPayer = i + 1
        }
    }

    println(biggestTaxPayer)
}