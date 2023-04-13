package activity01_j
import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

fun main() {
    val groceryItems = mapOf(
        "cabbage" to 2.5,
        "potato" to 3.0,
        "okra" to 4.0,
        "eggplant" to 5.0,
        "beef" to 12.0,
        "chicken" to 8.0,
        "fish" to 15.0,
        "pork" to 10.0,
        "mineral water" to 1.0,
        "milk" to 3.0,
        "beer" to 5.0,
        "soft drink" to 2.0,
        "cotton" to 1.0,
        "cotton buds" to 1.5,
        "alcohol" to 2.0,
        "soap" to 3.0
    )

    var cartItems = mutableMapOf<String, Int>()
    var totalCost = 0.0

    while (true) {
//        logger.info{groceryItems}
        logger.info{"Enter item name or 'done' to finish: "}
        val itemName = readLine()?.toLowerCase()
        var itemQuantity:Int? = null

        if (itemName == "done") break

        if (itemName == null || itemName =="") {
            logger.info{"Invalid Input"}
            continue
        }

        if (itemName !in groceryItems.keys) {
            logger.info{"Item not found."}
            continue
        }

        while(true){
            logger.info{"Enter quantity: "}
             itemQuantity = readLine()!!.toIntOrNull()
            if (itemQuantity == null) {
                logger.info{"Invalid quantity."}
                continue
            }
            else{
                break
            }
        }


        cartItems[itemName!!] = cartItems.getOrDefault(itemName, itemQuantity!!)
        totalCost += groceryItems[itemName]!! * itemQuantity!!
    }

    logger.info{"Items bought:"}
    cartItems.forEach { (item, quantity) ->
        logger.info{"- $item: $quantity"}
    }
//    logger.info{cartItems}
    logger.info{"Total cost: $totalCost"}
}







