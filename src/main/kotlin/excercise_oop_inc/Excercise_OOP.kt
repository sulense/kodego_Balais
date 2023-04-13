package excercise_oop_inc

enum class OrderStatus {
    SENT_TO_KITCHEN, BEING_PREPARED, FOR_PICKUP, FOR_DELIVERY, DELIVERED, CANCELLED, PAID, UNKNOWN
}

data class Customer(val firstName: String, val lastName: String, val mobileNumber: String, val address: String)

abstract class Item(val name: String, val price: Double)

class FreshFruit(name: String, price: Double) : Item(name, price)

class Shake(name: String, price: Double) : Item(name, price)

class Juice(name: String, price: Double) : Item(name, price)

class Sandwich(name: String, price: Double) : Item(name, price)

class Salad(name: String, price: Double) : Item(name, price)

data class Cart(val id: String, val customer: Customer, val items: MutableList<Item> = mutableListOf(), var status: OrderStatus = OrderStatus.UNKNOWN)

fun updateCartStatus(cart: Cart, newStatus: OrderStatus) {
    cart.status = newStatus
    println("Cart ${cart.id} status updated to $newStatus")
}

fun main() {
    val customer = Customer("John", "Doe", "123-456-7890", "123 Main St")
    val cart = Cart("12345", customer)
    val freshFruit = FreshFruit("Apple", 1.99)
    val shake = Shake("Chocolate", 3.99)
    val juice = Juice("Orange", 2.99)
    val sandwich = Sandwich("Turkey club", 5.99)
    val salad = Salad("Caesar", 4.99)

    cart.items.addAll(listOf(freshFruit, shake, juice, sandwich, salad))

    updateCartStatus(cart, OrderStatus.SENT_TO_KITCHEN)

    println("Cart ${cart.id} contains:")
    for (item in cart.items) {
        println("- ${item.name} \t$${item.price}")
    }
}
