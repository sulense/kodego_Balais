package activity06_b

import activity05_b.Publication
import java.util.*


//Create a function that will accept an item in the library and person who will borrow the item, (Use classes in Activity 05 - B).
//Throw the following exceptions :
//if the user still has 5 or more items from the library - Cannot borrow due to too many items still borrowed
//if the user has unpaid dues - Cannot borrow Exception due to unpaid dues
//if the item being borrowed has been reserved - Cannot borrow due to reserved
//it the item is for internal use - Cannot borrow due to item only used in library
//if the item if for fixing - Cannot borrow due to item needs to be fixed
//You will need to add the remaining classes and add the remaining methods and attributes in order to implement the functionalities.

class LibraryItem(val publication: Publication, val itemType: String, val isForInternalUse: Boolean = false, val isForFixing: Boolean = false) {
    var isReserved: Boolean = false
    fun reserve() {
        isReserved = true
    }
}

class LibraryMember(val name: String, val memberId: String, var itemsBorrowed: MutableList<LibraryItem> = mutableListOf(), var unpaidDues: Double = 0.0) {

    fun borrowItem(item: LibraryItem) {
        if (itemsBorrowed.size >= 5) {
            throw Exception("Cannot borrow due to too many items still borrowed")
        }
        if (unpaidDues > 0.0) {
            throw Exception("Cannot borrow due to unpaid dues")
        }
        if (item.isReserved) {
            throw Exception("Cannot borrow due to reserved")
        }
        if (item.isForInternalUse) {
            throw Exception("Cannot borrow due to item only used in library")
        }
        if (item.isForFixing) {
            throw Exception("Cannot borrow due to item needs to be fixed")
        }
        itemsBorrowed.add(item)
    }
}

fun borrowItem(item: LibraryItem, member: LibraryMember) {
    member.borrowItem(item)
}
