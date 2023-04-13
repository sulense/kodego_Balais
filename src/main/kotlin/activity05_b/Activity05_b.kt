package activity05_b

import java.util.*


//1. A book, a magazine, a newspaper and comics inherits from a Publication class. Identify the attributes and the methods for the publication.
//2. There are several Audio / Video materials, Recordings, Documentary, Movies and powerpoint materials.
//What will you use to present the different types of Audio / Video presentation, a class or an enum? Why?
//Implement your answer in code.
//3. Authors and Illustrators seem to have similar data? What will you use to present the two a class or an enum or will you keep them as is? Why?
//Implement your answer in code.

open class Publication(var title: String, var publisher: String, var publicationDate: Date, var price: Double) {

    fun getTitle1(): String = title

    fun setTitle1(title: String) {
        this.title = title
    }
    fun getPublisher1(): String = publisher

    fun setPublisher1(publisher: String) {
        this.publisher = publisher
    }
    fun getPublicationDate1(): Date = publicationDate

    fun setPublicationDate1(publicationDate: Date) {
        this.publicationDate = publicationDate
    }
    fun getPrice1(): Double = price

    fun setPrice1(price: Double) {
        this.price = price
    }
}

class Book(title: String, publisher: String, publicationDate: Date, price: Double, val author: String)
    : Publication(title, publisher, publicationDate, price)

class Magazine(title: String, publisher: String, publicationDate: Date, price: Double, val edition: Int)
    : Publication(title, publisher, publicationDate, price)

class Newspaper(title: String, publisher: String, publicationDate: Date, price: Double, val region: String)
    : Publication(title, publisher, publicationDate, price)

class Comics(title: String, publisher: String, publicationDate: Date, price: Double, val artist: String)
    : Publication(title, publisher, publicationDate, price)

enum class AudioVideoType {
    RECORDINGS,
    DOCUMENTARY,
    MOVIES,
    POWERPOINT
}

class AudioVideoPresentation(val title: String, val type: AudioVideoType, val duration: Int)

class Author(val name: String, val nationality: String, val birthdate: Date)

class Illustrator(val name: String, val style: String, val yearsOfExperience: Int)
