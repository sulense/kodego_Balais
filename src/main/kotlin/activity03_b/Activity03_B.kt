package activity03_b

import java.util.ArrayList

//Covered Topic(s) : Functions
//Instructions :
//1. Create an ArrayList of bookname with 20 entries.
//2. Create a function "isBookInRecord" that will accept a String and return true if the book is found, otherwise false.
//3. Create a function "addBook" that will accept a String and add it to the ArrayList.
//4. Create a function "removeBook"  that will accept a name and remove it from the ArrayList if it exactly matches the book name.
//5. Create a function "countBooks" that will return the size of the ArrayList.
//6. Create a function "searchBookWildSearch" that will accept a String and search if that string is found with in the ArrayList,
// it will return an ArrayList of books that matched if there are.
//7. Create a function  "searchBookName" that will accept a String and search if there is an exact match of the String input, it will
// return an ArrayList of books that matched if there are.
//8.  Create a function "showBooks" that will print all the entries in the ArrayList.

//class Library{
val bookList: ArrayList<String> = arrayListOf(
    "The Alchemist's Daughter",
        "The Shadow of the Wind",
        "The Nightingale",
        "The Hunger Games",
        "The Book Thief",
        "The Martian",
        "The Girl on the Train",
        "The Da Vinci Code",
        "The Catcher in the Rye",
        "The Great Gatsby",
        "The Picture of Dorian Gray",
        "The Adventures of Huckleberry Finn",
        "The Lord of the Rings",
        "The Chronicles of Narnia",
        "The Hobbit",
        "The Hitchhiker's Guide to the Galaxy",
        "To Kill a Mockingbird",
        "Pride and Prejudice",
        "Wuthering Heights",
        "Jane Eyre")

fun isBookInRecord(bookName: String): Boolean {
    return bookList.contains(bookName)
}

fun addBook(bookName: String) {
    bookList.add(bookName)
}

fun removeBook(bookName: String) {
    bookList.remove(bookName)
}

fun countBooks(): Int {
    return bookList.size
}

fun searchBookWildSearch(searchString: String): ArrayList<String> {
    val matchingBooks = ArrayList<String>()
    for (book in bookList) {
        if (book.contains(searchString)) {
            matchingBooks.add(book)
        }
    }
    return matchingBooks
}

fun searchBookName(bookName: String): ArrayList<String> {
    val matchingBooks = ArrayList<String>()
    for (book in bookList) {
        if (book == bookName) {
            matchingBooks.add(book)
        }
    }
    return matchingBooks
}
fun searchBook(bookName: String): ArrayList<String> {
        return if (bookName.length <= 10) {
            searchBookWildSearch(bookName)
        } else {
            searchBookName(bookName)
        }
    }

fun showBooks() {
    println("List of books:")
    for (book in bookList) {
        println("- $book")
    }
}



//fun main() {
//    val library = Library()
//    var running = true
//
//    println("Welcome to the Library Management System")
//
//    while (running) {
//        println("\nWhat would you like to do?")
//        println("1. Show all books")
//        println("2. Add a book")
//        println("3. Remove a book")
//        println("4. Search for a book")
//        println("5. Count the number of books")
//        println("6. Exit")
//
//        print("Enter your choice: ")
//        var choice = readLine()!!.toIntOrNull() ?: continue
//
//
//        when (choice) {
//            1 -> library.showBooks()
//            2 -> {
//                print("Enter the name of the book to add: ")
//                val bookName = readLine()
//                if (bookName != null){
//                    library.addBook(bookName)
//                    println("$bookName added to the library.")
//                }
//
//            }
//            3 -> {
//                print("Enter the name of the book to remove: ")
//                val bookName = readLine()
//
//                if (bookName != null){
//                    if (library.isBookInRecord(bookName)) {
//                    library.removeBook(bookName)
//                    println("$bookName removed from the library.")
//                } else {
//                    println("$bookName not found in the library.")
//                }}
//            }
//            4 -> {
//                print("Enter a search string: ")
//                val searchString = readLine()
//                if (searchString != null){
//                    val matchingBooks = library.searchBook(searchString)
//                    if (matchingBooks.isEmpty()) {
//                        println("No books found.")
//                    } else {
//                        println("Matching books:")
//                        for (book in matchingBooks) {
//                            println("- $book")
//                        }
//                    }
//                }
//
//            }
//            5 -> println("There are ${library.countBooks()} books in the library.")
//            6 -> {running = false
//                println("Goodbye!")}
//            else -> println("Invalid choice. Please try again.")
//        }
//    }
//}
//}