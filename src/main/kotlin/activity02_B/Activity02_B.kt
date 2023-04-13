package activity02_B

import java.util.*

import java.util.Date

//Implement Activity 01 -  B using data structure.


// Books
val books = mutableListOf(
    mapOf(
        "title" to "The Great Gatsby",
        "author" to "F. Scott Fitzgerald",
        "publisher" to "Charles Scribner's Sons",
        "publicationDate" to Date(1925, 4, 10),
        "isbn" to "978-0-7432-7356-5",
        "genre" to "Literary fiction",
        "numberOfPages" to 218
    ),
    mapOf(
        "title" to "To Kill a Mockingbird",
        "author" to "Harper Lee",
        "publisher" to "J. B. Lippincott & Co.",
        "publicationDate" to Date(1960, 7, 11),
        "isbn" to "978-0-446-31078-0",
        "genre" to "Southern Gothic",
        "numberOfPages" to 281
    )
)

// Magazines
val magazines = mutableListOf(
    mapOf(
        "title" to "Time",
        "publisher" to "Meredith Corporation",
        "publicationDate" to Date(2023, 3, 27),
        "issn" to "0040-781X",
        "genre" to "News and current affairs",
        "numberOfPages" to 86
    ),
    mapOf(
        "title" to "National Geographic",
        "publisher" to "National Geographic Society",
        "publicationDate" to Date(2023, 4, 1),
        "issn" to "0027-9358",
        "genre" to "Nature and science",
        "numberOfPages" to 146
    )
)
// Journals
val journals = mutableListOf(
    mapOf(
        "title" to "Nature",
        "publisher" to "Springer Nature",
        "publicationDate" to Date(2023, 3, 16),
        "issn" to "0028-0836",
        "numberOfPages" to 50
    ),
    mapOf(
        "title" to "Science",
        "publisher" to "American Association for the Advancement of Science",
        "publicationDate" to Date(2023, 3, 17),
        "issn" to "0036-8075",
        "numberOfPages" to 60
    )
)

// Audiobooks
val audiobooks = mutableListOf(
    mapOf(
        "title" to "The Martian",
        "author" to "Andy Weir",
        "narrator" to "R. C. Bray",
        "publisher" to "Podium Publishing",
        "publicationDate" to Date(2014, 3, 22),
        "isbn" to "978-0-8041-3902-1",
        "genre" to "Science fiction",
        "runningTime" to 765
    ),
    mapOf(
        "title" to "Harry Potter and the Philosopher's Stone",
        "author" to "J. K. Rowling",
        "narrator" to "Jim Dale",
        "publisher" to "Listening Library",
        "publicationDate" to Date(1997, 6, 26),
        "isbn" to "978-0-7475-3269-6",
        "genre" to "Fantasy",
        "runningTime" to 532
    )
)

// E-books
val eBooks = mutableListOf(
    mapOf(
        "title" to "The Catcher in the Rye",
        "author" to "J. D. Salinger",
        "publisher" to "Little, Brown and Company",
        "publicationDate" to Date(1951, 7, 16),
        "isbn" to "978-0-316-76951-2",
        "genre" to "Coming-of-age fiction"
    ),
    mapOf(
        "title" to "1984",
        "author" to "George Orwell",
        "publisher" to "Secker and Warburg",
        "publicationDate" to Date(1949, 6, 8),
        "isbn" to "978-0-452-28423-4",
        "genre" to "Dystopian fiction"
    )
)
//fun main() {
//
//    // Books
//    val books = mutableListOf(
//        mapOf(
//            "title" to "The Great Gatsby",
//            "author" to "F. Scott Fitzgerald",
//            "publisher" to "Charles Scribner's Sons",
//            "publicationDate" to Date(1925, 4, 10),
//            "isbn" to "978-0-7432-7356-5",
//            "genre" to "Literary fiction",
//            "numberOfPages" to 218
//        ),
//        mapOf(
//            "title" to "To Kill a Mockingbird",
//            "author" to "Harper Lee",
//            "publisher" to "J. B. Lippincott & Co.",
//            "publicationDate" to Date(1960, 7, 11),
//            "isbn" to "978-0-446-31078-0",
//            "genre" to "Southern Gothic",
//            "numberOfPages" to 281
//        )
//    )
//
//    val addBook = mapOf("title" to "The Great Gatsby",
//        "author" to "F. Scott Fitzgerald",
//        "publisher" to "Charles Scribner's Sons",
//        "publicationDate" to Date(1925, 4, 10),
//        "isbn" to "978-0-7432-7356-5",
//        "genre" to "Literary fiction",
//        "numberOfPages" to 218)
//
//   books.add(addBook)
//}
