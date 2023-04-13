package activity05_c

import mu.KotlinLogging


//Covered Topic(s) : OOP
//
//1. Create a parent class for all the products in the grocery.
//2. Create a cart to store the groceries.
//3. Create a Main class where you will add the Cart.
//4. In the main class add the following functions
//a - add to cart > add an item in the cart
//b - remove from cart > remove item in the cart
//c - check out cart > compute the total cost of the cart.

private val logger = KotlinLogging.logger {}

open class GroceryProduct(val name: String, val price: Double)


class Cart {
    private val items = mutableListOf<GroceryProduct>()

    fun addItem(item: GroceryProduct) {
        items.add(item)
    }

    fun removeItem(item: GroceryProduct) {
        items.remove(item)
    }

    fun getTotal(): Double {
        var total = 0.0
        for (item in items) {
            total += item.price
        }
        return total
    }
}


class Main {
    private val cart = Cart()

    fun addToCart(item: GroceryProduct) {
        cart.addItem(item)
        logger.info{"${item.name} added to cart."}
    }

    fun removeFromCart(item: GroceryProduct) {
        cart.removeItem(item)
        logger.info{"${item.name} removed from cart."}
    }

    fun checkoutCart() {
        val total = cart.getTotal()
        logger.info{"Total cost of cart: $total"}
    }
}


fun main() {
    val main = Main()

    val apple = GroceryProduct("Apple", 1.0)
    val milk = GroceryProduct("Milk", 2.0)
    val bread = GroceryProduct("Bread", 3.0)

    main.addToCart(apple)
    main.addToCart(milk)
    main.addToCart(bread)

    main.removeFromCart(milk)

    main.checkoutCart()
}
