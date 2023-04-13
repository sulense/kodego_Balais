package activity07_c
import activity06_c.Customer
import activity06_c.Item
import activity06_c.checkOutCart
import org.junit.Test
import org.junit.Assert.*

class ShoppingCartTest {

    @Test
    fun testAddItemToCart() {
        val item = Item("Book", 20.0, 0)
        val customer = Customer("John", 30, 100.0, mutableListOf())
        customer.cart.add(item)
        assertEquals(1, customer.cart.size)
        assertEquals(item, customer.cart[0])
    }

    @Test
    fun testCheckOutCart() {
        val book = Item("Book", 20.0, 0)
        val alcohol = Item("Alcohol", 30.0, 21)
        val customer = Customer("John", 30, 100.0, mutableListOf(book, alcohol))
        try {
            checkOutCart(customer)
        } catch (e: Exception) {
            fail("throw exception: ${e.message}")
        }
        assertEquals(2, customer.cart.size)
        assertEquals(100.0, customer.money, 0.001)
    }

}
