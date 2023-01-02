package activity05_c

class Product(val name: String, val price: Double)

//The Cart class has a mutable list of products and three methods: addToCart(), removeFromCart(), and checkOutCart().
//The addToCart() and removeFromCart() methods add and remove items from the list, respectively.
//The checkOutCart() method calculates the total cost of the items in the list.

class Cart {
    private val items = mutableListOf<Product>()

    fun addToCart(product: Product) {
        items.add(product)
    }

    fun removeFromCart(product: Product) {
        items.remove(product)
    }

    fun checkOutCart(): Double {
        var total = 0.0
        for (product in items) {
            total += product.price
        }
        return total
    }
}

class Main {
    val cart = Cart()

    fun addToCart(product: Product) {
        cart.addToCart(product)
    }

    fun removeFromCart(product: Product) {
        cart.removeFromCart(product)
    }

    fun checkOutCart(): Double {
        return cart.checkOutCart()
    }
}
