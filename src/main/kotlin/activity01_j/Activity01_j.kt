package activity01_j

import java.math.BigDecimal

@Suppress("UNREACHABLE_CODE")
fun main() {
//Items
    var items: Map<Int , String> = mapOf((1 to "Cabbage"), (2 to "potato"), (3 to "egg plant"), ( 4 to "okra"),
        (5 to "beef"), (6 to "chicken"), (7 to "fish"), ( 8 to "pork"),
        (9 to "mineral water"), (10 to "milk"), (11 to "beer"), ( 12 to "soft drink"),
        (13 to "cotton"), (14 to "cotton buds"), (15 to "alcohol"), ( 16 to "soap"))


//Prices
    var Prices: Map<String, Double> = mapOf(
        ("Cabbage" to 5.0), ("potato" to 3.0), ("egg plant" to 2.0), ("okra" to 1.0), //Vegetables
        ("beef" to 1.0), ("chicken" to 1.0), ("fish" to 1.0),("pork" to 1.0),        //Meat
        ("mineral water" to 1.0),("milk" to 1.0), ("beer" to 1.0),("soft drink" to 1.0),//Beverage
        ("cotton" to 1.0),("cotton buds" to 1.0),("alcohol" to 1.0),("soap" to 1.0))//Hygiene

    var itemsOrdered:List<String> = mutableListOf<String>()
    var itemsOrdered1= itemsOrdered as ArrayList
    var total = 0.0

    while(true){
        print("Code: ")
        var x = readLine()!!.toIntOrNull()

        if(x in items){
            var y = items.get(x)
            if (y != null) {
                itemsOrdered1.add(y)
            }
            println("Items Ordered: $itemsOrdered1")

            }
        else break
        }

    for(item in itemsOrdered1){
        if(item in Prices){
            var z = Prices.get(item)
            if(z != null) total += z
        }
    }
    println("Items Ordered: $itemsOrdered1")
    println("Total:₱$total")
    12
        }





