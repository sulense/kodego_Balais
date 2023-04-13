package activity07_b

import activity05_b.Publication
import activity06_b.LibraryItem
import activity06_b.LibraryMember
import activity06_b.borrowItem
import java.util.*
import org.junit.Test
import org.junit.Assert.*
import org.junit.jupiter.api.assertThrows

class LibraryUnitTest {

    @Test
    fun testLibraryItem() {
        val publication = Publication("Book Title", "Publisher", Date(), 10.0)
        val item = LibraryItem(publication, "book", true, false)

        assertEquals(publication, item.publication)
        assertEquals("book", item.itemType)
        assertTrue(item.isForInternalUse)
        assertFalse(item.isForFixing)
        assertFalse(item.isReserved)

        item.reserve()
        assertTrue(item.isReserved)
    }

    @Test
    fun testLibraryMember() {
        val member = LibraryMember("John Doe", "12345", mutableListOf(), 0.0)

        // borrow items
        val publication1 = Publication("Book 1", "Publisher 1", Date(), 10.0)
        val item1 = LibraryItem(publication1, "book")
        borrowItem(item1, member)
        assertEquals(listOf(item1), member.itemsBorrowed)

        val publication2 = Publication("Book 2", "Publisher 2", Date(), 20.0)
        val item2 = LibraryItem(publication2, "book")
        borrowItem(item2, member)
        assertEquals(listOf(item1, item2), member.itemsBorrowed)

        // borrow too many items
        val publication3 = Publication("Book 3", "Publisher 3", Date(), 30.0)
        val item3 = LibraryItem(publication3, "book")
        val publication4 = Publication("Book 4", "Publisher 4", Date(), 40.0)
        val item4 = LibraryItem(publication4, "book")
        val publication5 = Publication("Book 5", "Publisher 5", Date(), 50.0)
        val item5 = LibraryItem(publication5, "book")
        val publication6 = Publication("Book 6", "Publisher 6", Date(), 60.0)
        val item6 = LibraryItem(publication6, "book")
        val publication7 = Publication("Book 7", "Publisher 7", Date(), 70.0)
        val item7 = LibraryItem(publication7, "book")
        assertThrows<Exception> {
            borrowItem(item3, member)
            borrowItem(item4, member)
            borrowItem(item5, member)
            borrowItem(item6, member)
            borrowItem(item7, member)
        }

        // try to borrow with unpaid dues
        member.unpaidDues = 10.0
        assertThrows<Exception> { borrowItem(item3, member) }

        // try to borrow a reserved item
        item1.reserve()
        assertThrows<Exception> { borrowItem(item1, member) }
    }
}
