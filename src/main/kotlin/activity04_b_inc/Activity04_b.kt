package activity04_b_inc

import mu.KotlinLogging
import java.time.Duration
import java.time.LocalDate

//1. Use class to represent the Book rather string.
//A book has a title, authors, year published, edition, ISBN, publisher.
//A book may have a list of chapters.
//A book has a number of pages.
//2. Add a class for magazines.
//A magazine has an editor, a title, a month published, a year published
//3. Add a class for newspaper.
//A newspaper has a name, day published, month published, year published and headline.
//4. Add a class Authors.
//Authors have firstName, lastName, middleName, date of birth.
//5. Add a class Comics.
//A comic has a title, month published, year published, illustrators, publisher.
//Create a class illustrator.
//Illustrator have firstName, lastName, middleName, date of birth.
//6. Add a class Article.
//An article has a title, content, author.
//A Newspaper, and magazine have articles.
//7. Create a search function to search for the title of a magazine, newspaper, comics.
//8. Create a function that will list the name of the magazine, newspaper, comics or book, author has written in.
//9. Create a class for Audio / Video recording.
//The class should show whether the recording has a video or audio or both.
//It has a length, date recorded, title, publisher.
//10. Create a Publisher class.
//A publisher a name, address and date established.

private val logger = KotlinLogging.logger {}

data class Author(
    val firstName: String,
    val lastName: String,
    val middleName: String?,
    val dateOfBirth: LocalDate)

data class Publisher(
    val name: String,
    val address: String,
    val dateEstablished: LocalDate)

data class Book(
    val title: String,
    val authors: List<Author>,
    val yearPublished: Int,
    val edition: Int,
    val isbn: String,
    val publisher: Publisher,
    val chapters: List<String>?,
    val numPages: Int)

data class Magazine(
    val editor: Author,
    val title: String,
    val monthPublished: Int,
    val yearPublished: Int,
    val articles: List<Article>)

data class Newspaper(
    val name: String,
    val dayPublished: Int,
    val monthPublished: Int,
    val yearPublished: Int,
    val headline: String,
    val articles: List<Article>)

data class Illustrator(
    val firstName: String,
    val lastName: String,
    val middleName: String?,
    val dateOfBirth: LocalDate)

data class Comic(
    val title: String,
    val monthPublished: Int,
    val yearPublished: Int,
    val illustrators: List<Illustrator>,
    val publisher: Publisher)

data class Article(
    val title: String,
    val content: String,
    val author: Author)

data class Recording(
    val title: String,
    val publisher: Publisher,
    val length: Duration,
    val dateRecorded: LocalDate,
    val hasVideo: Boolean,
    val hasAudio: Boolean)

class Search {
    fun searchForTitle(title: String, vararg items: Any): Boolean {
        for (item in items) {
            when (item) {
                is Book -> if (item.title == title) return true
                is Magazine -> if (item.title == title) return true
                is Newspaper -> if (item.name == title) return true
                is Comic -> if (item.title == title) return true
            }
        }
        return false
    }
}

class ListItems {
    fun listItemsByAuthor(author: Author, vararg items: Any): List<String> {
        val itemTitles = mutableListOf<String>()
        for (item in items) {
            when (item) {
                is Book -> if (item.authors.contains(author)) itemTitles.add(item.title)
                is Magazine -> {
                    for (article in item.articles) {
                        if (article.author == author) {
                            itemTitles.add(item.title)
                            break
                        }
                    }
                }
                is Newspaper -> {
                    for (article in item.articles) {
                        if (article.author == author) {
                            itemTitles.add(item.name)
                            break
                        }
                    }
                }
                is Comic -> {
                    for (illustrator in item.illustrators) {
                        for (illustrator in item.illustrators) {
                            if (illustrator.firstName == author.firstName && illustrator.lastName == author.lastName &&
                                illustrator.middleName == author.middleName && illustrator.dateOfBirth == author.dateOfBirth) {
                                itemTitles.add(item.title)
                                break
                            }
                        }

                    }
                }
            }
        }
        return itemTitles
    }
}


//fun main() {
//    val author1 = Author("Juan", "Karlos", null, LocalDate.of(1965, 7, 31))
//    val author2 = Author("Geor", "Giaaa", null, LocalDate.of(1948, 9, 20))
//    val author3 = Author("Stephen", "Kurly", null, LocalDate.of(1947, 9, 21))
//
//    val publisher1 = Publisher("Jose Rizal", "Gensan, PH", LocalDate.of(1986, 9, 26))
//    val publisher2 = Publisher("Spectre", "Dota 2", LocalDate.of(1955, 1, 1))
//
//    val book1 = Book("Harry Potter's Hand",
//        listOf(author1),
//        1997,
//        1,
//        "11111111111111",
//        publisher1,
//        listOf("nawala na sya", "bakit sya nawala", "di ko alam bat sya nawala"),
//        223)
//    val book2 = Book("Game of Thrones",
//        listOf(author2),
//        1996,
//        1,
//        "2222222222",
//        publisher2,
//        listOf("Hello", "Loved", "Goodbye"),
//        694)
//
//    val magazine1 = Magazine(author2,
//        "Ang Ayaw at Hindi Ayaw",
//        2022,
//        3,
//        listOf(Article("Wag pooooo",
//            "Bat ayaw mo...." ,
//            author2)))
//
//    val newspaper1 = Newspaper("Under The Sea",
//        20,
//        3,
//        2022,
//        "Isda Nalunod Patay!",
//        listOf(Article("Article title",
//            "Article content" ,
//            author3)))
//
//    val illustrator1 = Illustrator("Jimmy", "Jimmy", null, LocalDate.of(1964, 8, 11))
//    val illustrator2 = Illustrator("Where", "aryo", null, LocalDate.of(1961, 3, 16))
//
//    val comic1 = Comic("Ang pagong na pogi",
//        2003,
//        1,
//        listOf(illustrator1, illustrator2),
//        publisher2)
//
//    val recording1 = Recording("Ed Sheeran: Perfect",
//        publisher2,
//        Duration.ofMinutes(35),
//        LocalDate.of(1970, 5, 8),
//        true,
//        true)
//
//
//    val search = Search()
//    val bookFound = search.searchForTitle("Game of Thrones", book1, magazine1, newspaper1, comic1, book2)
//    logger.info{"Is Game of Thrones in the list of items? $bookFound"}
//
//
//    val listItems = ListItems().listItemsByAuthor(author2, book1, magazine1, newspaper1, comic1)
//    logger.info{"Items by George R.R. Martin: $listItems"}
//}
//
