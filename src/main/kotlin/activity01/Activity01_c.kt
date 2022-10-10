package activity01

import java.math.BigDecimal

fun main() {
    println("Grocery Store")
    println("Items Available:")
//Vegetables
    println("VEGETABLES")

    var cabbage:String = "Cabbage"
    var cabbagePerKilo= BigDecimal(15.25)
    println("1. $cabbage \n Per Kilogram: $cabbagePerKilo")

    var potato:String = "Potato"
    var potatoPerKilo= BigDecimal(45.75)
    println("2. $potato \n Per Kilogram: $potatoPerKilo")


    var okra:String = "Okra"
    var okraPerKilo= BigDecimal(7.25)
    println("3. $okra \n Per Kilogram: $okraPerKilo")

    var eggPlant:String = "Eggplant"
    var eggPlantPerKilo= BigDecimal(15.00)
    println("4. $eggPlant \n Per Kilogram: $eggPlantPerKilo \n---------------")

//Meat
    println("MEAT")

    var beef:String = "Beef"
    var beefPerKilo = BigDecimal(125.75)
    println("5. $beef \n Per Kilogram: $beefPerKilo")

    var chicken:String = "Chicken"
    var chickenPerKilo = BigDecimal(101.25)
    println("6. $chicken \n Per Kilogram: $chickenPerKilo")

    var fish:String = "Fish"
    var fishPerKilo = BigDecimal(91.25)
    println("7. $fish \n Per Kilogram: $fishPerKilo")

    var pork:String = "Pork"
    var porkPerKilo = BigDecimal(203.25)
    println("8. $pork \n Per Kilogram: $porkPerKilo \n---------------")

//Beverage
    println("BEVERAGE")

    var mineralWater:String = "Mineral Water"
    var mineralWaterPrice = BigDecimal(15.00)
    println("9. $mineralWater \n Price: $mineralWaterPrice")

    var milk:String = "Milk"
    var milkPrice = BigDecimal(20.00)
    println("10. $milk \n Price: $milkPrice")

    var beer:String = "Beer"
    var beerPrice = BigDecimal(180.00)
    println("11. $beer \n Price: $beerPrice")

    var softDrink:String = "Soft drink"
    var softDrinkPrice = BigDecimal(20.00)
    println("12. $softDrink \n Price: $softDrinkPrice \n---------------")

//Hygiene
    println("Hygiene")

    var cotton:String = "Cotton"
    var cottonPrice = BigDecimal(12.00)
    println("13. $cotton \n Price: $cottonPrice")

    var cottonBuds:String = "Cotton Buds"
    var cottonBudsPrice = BigDecimal(15.00)
    println("14. $cottonBuds \n Price: $cottonBudsPrice")

    var alcohol:String = "Alcohol"
    var alcoholPrice = BigDecimal(25.00)
    println("15. $alcohol \n Price: $alcoholPrice")

    var soap:String = "Soap"
    var soapPrice = BigDecimal(15.00)
    println("16. $soap \n Price: $soapPrice \n---------------")

    println("Add to cart:")
    var selectedItem = readLine()!!.toInt()

    var selectedItem1 = when {
        selectedItem == 1 -> println("Added 1 $cabbage to your cart")
        selectedItem == 2 -> println("Added 1 $potato to your cart")
        selectedItem == 3 -> println("Added 1 $okra to your cart")
        selectedItem == 4 -> println("Added 1 $eggPlant to your cart")
        selectedItem == 5 -> println("Added 1 $beef to your cart")
        selectedItem == 6 -> println("Added 1 $chicken to your cart")
        selectedItem == 7 -> println("Added 1 $fish to your cart")
        selectedItem == 8 -> println("Added 1 $pork to your cart")
        selectedItem == 9 -> println("Added 1 $mineralWater to your cart")
        selectedItem == 10 -> println("Added 1 $milk to your cart")
        selectedItem == 11 -> println("Added 1 $beer to your cart")
        selectedItem == 12 -> println("Added 1 $softDrink to your cart")
        selectedItem == 13 -> println("Added 1 $cotton to your cart")
        selectedItem == 14 -> println("Added 1 $cottonBuds to your cart")
        selectedItem == 15 -> println("Added 1 $alcohol to your cart")
        selectedItem == 16 -> println("Added 1 $soap to your cart")
        else -> println("Error 404")
    }
}