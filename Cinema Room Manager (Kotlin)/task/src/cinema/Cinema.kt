package cinema

import java.util.Scanner

const val STANDARD_TICKET_PRICE = 10
const val LOWER_TICKET_PRICE = 8

fun buildCinema(numberOfRows: Int, numberOfSeatsInRow: Int): MutableList<MutableList<String>> {
    val cinema: MutableList<MutableList<String>> = mutableListOf()
    var seatCount = 1

    for (i in 0..numberOfRows) {
        val row = mutableListOf<String>()
        for (j in 0..numberOfSeatsInRow) {
            if (i == 0) {
                if (j == 0) row.add(" ") else row.add("$j")
            } else if (j == 0) {
                row.add("$seatCount")
                seatCount++
            } else {
                row.add("S")
            }
        }
        cinema.add(row)
    }

    return cinema
}

fun showCinema(cinema: MutableList<MutableList<String>>) {
    println("\nCinema:")
    for (i in cinema.indices) {
        println(cinema[i].joinToString(" "))
    }
}

fun calculateTicketPrice(numberOfRows: Int, numberOfSeatsInRow: Int, selectedRow: Int): Int {
    val ticketPrice = if (numberOfRows * numberOfSeatsInRow <= 60) {
        STANDARD_TICKET_PRICE
    } else if (selectedRow > numberOfRows / 2) {
        LOWER_TICKET_PRICE
    } else {
        STANDARD_TICKET_PRICE
    }
    return ticketPrice
}

fun ticketPurchase(cinema: MutableList<MutableList<String>>, numberOfRows: Int, numberOfSeatsInRow: Int) {
    val scanner = Scanner(System.`in`)
    var validInput = false

    do {
        println("\nEnter a row number:")
        val selectedRow: Int = try { scanner.nextInt() } catch (e: Exception) { 0 }

        println("Enter a seat number in that row:")
        val selectedSeatInRow: Int = try { scanner.nextInt() } catch (e: Exception) { 0 }

        if (selectedRow !in 1..numberOfRows || selectedSeatInRow !in 1..numberOfSeatsInRow) {
            println("\nWrong input!")
        } else if (cinema[selectedRow][selectedSeatInRow] == "B") {
            println("\nThat ticket has already been purchased!")
        } else {
            cinema[selectedRow][selectedSeatInRow] = "B"

            val ticketPrice = calculateTicketPrice(numberOfRows, numberOfSeatsInRow, selectedRow)

            println("\nTicket price: $$ticketPrice")
            validInput = true
        }
    } while (!validInput)
}

fun showStatistics(cinema: MutableList<MutableList<String>>, numberOfRows: Int, numberOfSeatsInRow: Int) {
    var numberOfPurchasedTickets = 0
    var currentIncome = 0
    val totalIncome = if (numberOfRows * numberOfSeatsInRow <= 60) {
        STANDARD_TICKET_PRICE * numberOfRows * numberOfSeatsInRow
    } else {
        (LOWER_TICKET_PRICE * (numberOfRows / 2 + 1) + STANDARD_TICKET_PRICE * (numberOfRows / 2)) * numberOfSeatsInRow
    }

    for (row in cinema) {
        for (seat in row) {
            if (seat == "B") {
                numberOfPurchasedTickets++
                currentIncome += calculateTicketPrice(numberOfRows, numberOfSeatsInRow, cinema.indexOf(row))
            }
        }
    }

    val percentage = (numberOfPurchasedTickets * 100.0) / (numberOfRows * numberOfSeatsInRow)
    val formatPercentage = "%.2f".format(percentage)


    println("""
        Number of purchased tickets: $numberOfPurchasedTickets
        Percentage: $formatPercentage%
        Current income: $$currentIncome
        Total income: $$totalIncome
    """.trimIndent())
}

fun main() {
    val scanner = Scanner(System.`in`)

    println("Enter the number of rows:")
    val numberOfRows: Int = scanner.nextInt()

    println("Enter the number of seats in each row:")
    val numberOfSeatsInRow: Int = scanner.nextInt()

    val cinema = buildCinema(numberOfRows, numberOfSeatsInRow)

    do {
        println()
        println("""
            1. Show the seats
            2. Buy a ticket
            3. Statistics
            0. Exit
        """.trimIndent())
        val option = scanner.nextInt()
        when (option) {
            1 -> showCinema(cinema)
            2 -> ticketPurchase(cinema, numberOfRows, numberOfSeatsInRow)
            3 -> showStatistics(cinema, numberOfRows, numberOfSeatsInRow)
        }
    } while (option != 0)
}