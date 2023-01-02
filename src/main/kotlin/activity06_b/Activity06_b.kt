package activity06_b

class LibraryItem(val title: String, val internalUseOnly: Boolean, val forFixing: Boolean)

class User(val name: String, val unpaidDues: Double, val borrowedItems: MutableList<LibraryItem>)

fun borrowItem(item: LibraryItem, user: User) {
    if (user.borrowedItems.size >= 5) {
        throw TooManyItemsException("Cannot borrow due to too many items still borrowed")
    }
    if (user.unpaidDues > 0) {
        throw UnpaidDuesException("Cannot borrow due to unpaid dues")
    }
    if (item.internalUseOnly) {
        throw InternalUseOnlyException("Cannot borrow due to item only used in library")
    }
    if (item.forFixing) {
        throw ItemNeedsFixingException("Cannot borrow due to item needs to be fixed")
    }
    user.borrowedItems.add(item)
}

class TooManyItemsException(message: String): Exception(message)

class UnpaidDuesException(message: String): Exception(message)

class InternalUseOnlyException(message: String): Exception(message)

class ItemNeedsFixingException(message: String): Exception(message)

fun main() {
    val item = LibraryItem("Book", false, false)
    val user = User("John", 0.0, mutableListOf())

    try {
        borrowItem(item, user)
    } catch (e: TooManyItemsException) {
        println(e.message)
    } catch (e: UnpaidDuesException) {
        println(e.message)
    } catch (e: InternalUseOnlyException) {
        println(e.message)
    } catch (e: ItemNeedsFixingException) {
        println(e.message)
    }
}
