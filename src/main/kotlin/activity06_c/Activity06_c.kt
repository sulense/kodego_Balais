package activity06_c

//Here are five possible scenarios where a cart cannot be checked out properly:
//
//The cart is empty.
//The customer does not have enough money to pay for the items in the cart.
//The customer is not old enough to purchase certain items in the cart (e.g. alcohol, tobacco).
//Some of the items in the cart are out of stock.
//The payment method is invalid (e.g. credit card expiration date has passed).

class Item(val name: String, val price: Double, val ageRestriction: Int)

class Customer(val name: String, val age: Int, val money: Double, val cart: MutableList<Item>)

fun checkOutCart(customer: Customer) {
    if (customer.cart.isEmpty()) {
        throw EmptyCartException("Cannot check out empty cart")
    }
    if (customer.money < customer.cart.sumByDouble { it.price }) {
        throw InsufficientFundsException("Cannot check out due to insufficient funds")
    }
    if (customer.cart.any { it.ageRestriction > customer.age }) {
        throw AgeRestrictionException("Cannot check out due to age restriction on item")
    }
    if (customer.cart.any { !isInStock(it) }) {
        throw OutOfStockException("Cannot check out due to item being out of stock")
    }
    if (!isValidPaymentMethod()) {
        throw InvalidPaymentMethodException("Cannot check out due to invalid payment method")
    }
}

fun isInStock(item: Item): Boolean {
    // Check if item is in stock
    return true
}

fun isValidPaymentMethod(): Boolean {
    // Check if payment method is valid
    return true
}

class EmptyCartException(message: String): Exception(message)

class InsufficientFundsException(message: String): Exception(message)

class AgeRestrictionException(message: String): Exception(message)

class OutOfStockException(message: String): Exception(message)

class InvalidPaymentMethodException(message: String): Exception(message)

fun main() {
    val customer = Customer(
        "John", 30, 100.0, mutableListOf(
            Item("Book", 20.0, 0),
            Item("Alcohol", 30.0, 21)
        )
    )

    try {
        checkOutCart(customer)
    } catch (e: EmptyCartException) {
        println(e.message)
    } catch (e: InsufficientFundsException) {
        println(e.message)
    } catch (e: AgeRestrictionException) {
        println(e.message)
    } catch (e: OutOfStockException) {
        println(e.message)
    } catch (e: InvalidPaymentMethodException) {
        println(e.message)
    }
}
