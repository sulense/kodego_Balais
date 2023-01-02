package activity05_b

//For the Publication class, some possible attributes could be title, author, publication date, and page count.
//Some possible methods could be getTitle(), setTitle(), getAuthor(), setAuthor(), getPublicationDate(), setPublicationDate(), getPageCount(), and setPageCount().
open class Publication(var title: String, var author: String, var publicationDate: String, var pageCount: Int) {
    fun getTitle(): String {
        return title
    }

    fun setTitle(title: String) {
        this.title = title
    }

    fun getAuthor(): String {
        return author
    }

    fun setAuthor(author: String) {
        this.author = author
    }

    fun getPublicationDate(): String {
        return publicationDate
    }

    fun setPublicationDate(publicationDate: String) {
        this.publicationDate = publicationDate
    }

    fun getPageCount(): Int {
        return pageCount
    }

    fun setPageCount(pageCount: Int) {
        this.pageCount = pageCount
    }
}

class Book(title: String, author: String, publicationDate: String, pageCount: Int, val genre: String): Publication(title, author, publicationDate, pageCount)

class Magazine(title: String, author: String, publicationDate: String, pageCount: Int, val frequency: String): Publication(title, author, publicationDate, pageCount)

class Newspaper(title: String, author: String, publicationDate: String, pageCount: Int, val circulation: Int): Publication(title, author, publicationDate, pageCount)

class Comics(title: String, author: String, publicationDate: String, pageCount: Int, val artist: String): Publication(title, author, publicationDate, pageCount)


//To present the different types of Audio/Video presentations, it would be best to use an enum.
enum class AudioVideoType {
    RECORDINGS, DOCUMENTARY, MOVIES, POWERPOINT_MATERIALS
}

class AudioVideoMaterial(val title: String, val author: String, val audioVideoType: AudioVideoType)
