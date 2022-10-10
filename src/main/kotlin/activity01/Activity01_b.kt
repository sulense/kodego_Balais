package activity01

import java.time.LocalDateTime
import java.util.Date

fun main() {
    println("School Library")
    println("Available Books:")
//BOOK 1
    var book1:String = "Love From The Moon"
    var book1Genre:String = "Fiction"
    var book1Author:String= "James Blond"
    var book1PageNumber:Int = 201
    var book1VolumeNumber:Int = 2
    var book1DatePublished = Date(2001, 5,12)
    println("Title: $book1 \n Genre: $book1Genre \n Author: $book1Author \n Pages: $book1PageNumber Volume: $book1VolumeNumber\n Date Published: $book1DatePublished \n --------------------")
//BOOK 2
    var book2:String = "Lovers"
    var book2Genre:String = "Nonfiction"
    var book2Author:String= "James Martin"
    var book2PageNumber:Int = 193
    var book2VolumeNumber:Int = 1
    var book2DatePublished = Date(2002, 3,1)
    println("Title: $book2 \n Genre: $book2Genre \n Author: $book2Author \n Pages: $book2PageNumber Volume: $book2VolumeNumber\n Date Published: $book2DatePublished \n --------------------")
//BOOK 3
    var book3:String = "Science 101"
    var book3Genre:String = "Nonfiction"
    var book3Author:String= "James Reid"
    var book3PageNumber:Int = 332
    var book3VolumeNumber:Int = 4
    var book3DatePublished = Date(2004, 9,22)
    println("Title: $book3 \n Genre: $book3Genre \n Author: $book3Author \n Pages: $book3PageNumber Volume: $book3VolumeNumber\n Date Published: $book3DatePublished \n --------------------")
//BOOK 4
    var book4:String = "Moon Moon"
    var book4Genre:String = "Fiction"
    var book4Author:String= "James Yap"
    var book4PageNumber:Int = 276
    var book4VolumeNumber:Int = 2
    var book4DatePublished = Date(2011, 4,13)
    println("Title: $book4 \n Genre: $book4Genre \n Author: $book4Author \n Pages: $book4PageNumber Volume: $book4VolumeNumber\n Date Published: $book4DatePublished \n --------------------")
//BOOK 5
    var book5:String = "Loving You"
    var book5Genre:String = "Fiction"
    var book5Author:String= "James Lebron"
    var book5PageNumber:Int = 221
    var book5VolumeNumber:Int = 1
    var book5DatePublished = Date(2019, 5,30)
    println("Title: $book5 \n Genre: $book5Genre \n Author: $book5Author \n Pages: $book5PageNumber Volume: $book5VolumeNumber\n Date Published: $book5DatePublished \n --------------------")

    println("Book you want to borrow:")
    var selectedBook = readLine()!!.toInt()

    var selectedBook1 = when{
        selectedBook == 1 -> println("You borrowed the book: $book1.")
        selectedBook == 2 -> println("You borrowed the book: $book2.")
        selectedBook == 3 -> println("You borrowed the book: $book3.")
        selectedBook == 4 -> println("You borrowed the book: $book4.")
        selectedBook == 5 -> println("You borrowed the book: $book5.")

        else -> println("Error 404")
    }

}