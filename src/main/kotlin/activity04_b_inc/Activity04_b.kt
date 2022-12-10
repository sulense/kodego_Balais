package activity04_b_inc

import mu.KotlinLogging
private val logger = KotlinLogging.logger {}

class Book  {
    var title = "YEAH BOY"
    var author = "Boyet"
    var yearPublished = "1999"
    var edition = "First Editon"
    var iSBN = "0-335-24223-8"
    var publisher = "Neo"
}

class Magazines{
    var author = "Boyat"
    var title = "Nothing In This World"
    var monthPublished = "July"
    var yearPublished = "1978"
}

class Newspaper{
    var author = "Boyet"
    var dayPublished = "21"
    var monthPublished = "September"
    var yearPublished = "1998"
    var headLine = "Nothingness!"
}

class Comics{
    var title = "The Legend of China"
    var monthPublished = "October"
    var yearPublished = "1997"
    var author = "Boyat"
    var publisher = "Neo"
}

class Article{
    var title = "EverNothing"
    var content = "After the end"
    var author = "Boyat"
}

class AudioVideoRecording{
    var length = "2hrs"
    var dateRecorded = "September 22, 1996"
    var title = "OPS!"
    var publisher = "Neo"
}

class Publisher{
    var name = "Neo"
    var address = "J.P Rizal Street USA"
    var date = "September 5, 1999"
    var established = "September 4, 1985"
}

fun main(){
    var book = Book()
    var magazines = Magazines()
    var comics = Comics()
    var article = Article()
    var newspaper = Newspaper()
    var audioVideoRecording = AudioVideoRecording()
    var publisher = Publisher()

    var input:String?=null

    while(true){
        logger.info{"What do you want to search?"}
        input = readLine().toString()

        when {
            input == book.author -> logger.info{book.title}
            input == magazines.author -> logger.info{magazines.title}
            input == comics.author -> logger.info{comics.title}
            input == article.author -> logger.info{article.title}
            input == newspaper.author -> logger.info{newspaper.headLine}
            else -> logger.error{"Error 404"}
        }

    }

}