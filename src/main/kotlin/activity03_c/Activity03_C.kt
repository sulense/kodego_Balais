package activity03_c

import java.math.BigDecimal

//1. Create an ArrayList of grocery products with 20 entries.
//2. Create a HashMap called Cart.
//Hint:  Hashmap<String, Int>
//2. Create a function "addToCart" that will accept a String and an Int, the it will add the input in the Hashmap. If the
// Entry already exists, create a new entry in the HashMap.
//Hint : you may add a "_01", "_02"
//Example Coke_01, Coke_02
//3. Create a function "checkOut". This will compute how many items have been checked out.
//4. Create a function "removefromCart"  that will accept a String and remove the input from the Hashmap. If there are multiple entries,
// remove all from the HashMap.


import java.util.*


    val groceryList = arrayListOf(
        "Bread", "Eggs", "Milk", "Cheese", "Butter",
        "Chicken", "Beef", "Pork", "Fish", "Shrimp",
        "Rice", "Pasta", "Tomatoes", "Lettuce", "Carrots",
        "Potatoes", "Onions", "Garlic", "Apples", "Bananas"
    )

    fun addToCart(product: String, quantity: Int, cart: MutableMap<String, Int>) {
        var key = product
        while (cart.containsKey(key)) {
            key += "_01"
        }
        cart[key] = quantity
    }


    fun checkOut(cart: MutableMap<String, Int>): Int {
        var totalItems = 0
        for (quantity in cart.values) {
            totalItems += quantity
        }
        return totalItems
    }

    fun removeFromCart(product: String, cart: MutableMap<String, Int>) {
        val iterator = cart.iterator()
        while (iterator.hasNext()) {
            val entry = iterator.next()
            if (entry.key.startsWith(product)) {
                iterator.remove()
            }
        }
    }

//fun main() {
//
//    val cart = mutableMap<String, Int>()
//
//    addToCart("Milk", 2, cart)
//    addToCart("Cheese", 1, cart)
//    addToCart("Eggs", 1, cart)
//    addToCart("Bread", 3, cart)
//    addToCart("Chicken", 2, cart)
//    addToCart("Fish", 1, cart)
//    addToCart("Rice", 1, cart)
//    addToCart("Tomatoes", 3, cart)
//    addToCart("Potatoes", 2, cart)
//    addToCart("Apples", 4, cart)
//    addToCart("Bananas", 2, cart)
//
//    println("Items in cart: ")
//    for ((product, quantity) in cart) {
//        println("$product x$quantity")
//    }
//
//    println("Total items checked out: ${checkOut(cart)}")
//
//    removeFromCart("Milk", cart)
//    removeFromCart("Bread", cart)
//    removeFromCart("Tomatoes", cart)
//
//    println("Items in cart after removal: ")
//    for ((product, quantity) in cart) {
//        println("$product x$quantity")
//    }
//
//    println("Total items checked out: ${checkOut(cart)}")
//}

