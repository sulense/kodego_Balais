package activity01_I

import mu.KotlinLogging
import java.util.*


//
//Using Activity 01 - B, Implement a process where someone can borrow a book.
//User: Librarian
//Goal: Keep track book borrowed, who borrowed and how long it can be borrowed.
//Scope :
//Data Structures

private val logger = KotlinLogging.logger {}

fun main() {
    val availableBooks = mutableListOf<MutableMap<String, Any>>()
    val borrowedBooks = mutableListOf<MutableMap<String, Any>>()

    availableBooks.add(mutableMapOf(
        "title" to "The Great Gatsby",
        "author" to "F. Scott Fitzgerald",
        "isAvailable" to true
    ))
    availableBooks.add(mutableMapOf(
        "title" to "To Kill a Mockingbird",
        "author" to "Harper Lee",
        "isAvailable" to true
    ))
    availableBooks.add(mutableMapOf(
        "title" to "1984",
        "author" to "George Orwell",
        "isAvailable" to false
    ))
    availableBooks.add(mutableMapOf(
        "title" to "Pride and Prejudice",
        "author" to "Jane Austen",
        "isAvailable" to true
    ))

    print("Borrower's name: ")
    val borrowerName = readLine()!!

//Print the list of available books
    println("Available books:")
    availableBooks.forEachIndexed { index, book ->
        if (book["isAvailable"] == true) {
            println("${index + 1}. ${book["title"]} by ${book["author"]}")
        }else{
            println("${index + 1}. ${book["title"]} by ${book["author"]} --[NOT AVAILABLE]--")
        }
    }

//borrowing
    print("Enter the number of the book you want to borrow: ")
    val bookIndex = readLine()!!.toInt() - 1

//Check availability
    val selectedBook = availableBooks.getOrNull(bookIndex)
    if (selectedBook != null && selectedBook["isAvailable"] == true) {
        selectedBook["isAvailable"] = false
        borrowedBooks.add(selectedBook)

        println("${borrowerName} have borrowed '${selectedBook["title"]}'.")
    } else {
        println("Sorry, that book is not available.")
    }

}
