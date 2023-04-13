package activity04_c

import java.time.LocalDate

//Covered Topic(s) : Classes
//Create class for
//Poultry
//Fish
//Canned goods
//Snacks
//Frozen Products
//Fruits
//Vegetables
//Condiments
//Furniture
//Appliances
//Clothes
//Pet
//Sanitary Products
//Personal Care
//Add 5 more type of items you can find in the grocery.
//Identify the attributes for all the classes mentioned.


abstract class GroceryItem(
    val name: String,
    val brand: String,
    val price: Double,
    val quantity: Int,
    val weight: Double
)


class Poultry(
    name: String,
    brand: String,
    price: Double,
    quantity: Int,
    weight: Double,
    val animalType: String,
    val slaughterDate: LocalDate,
    val expirationDate: LocalDate
) : GroceryItem(name, brand, price, quantity, weight)


class Fish(
    name: String,
    brand: String,
    price: Double,
    quantity: Int,
    weight: Double,
    val species: String,
    val catchDate: LocalDate,
    val expirationDate: LocalDate
) : GroceryItem(name, brand, price, quantity, weight)


class CannedGoods(
    name: String,
    brand: String,
    price: Double,
    quantity: Int,
    weight: Double,
    val contents: String,
    val expirationDate: LocalDate
) : GroceryItem(name, brand, price, quantity, weight)


class Snacks(
    name: String,
    brand: String,
    price: Double,
    quantity: Int,
    weight: Double,
    val flavor: String,
    val expirationDate: LocalDate
) : GroceryItem(name, brand, price, quantity, weight)


class FrozenProducts(
    name: String,
    brand: String,
    price: Double,
    quantity: Int,
    weight: Double,
    val type: String,
    val expirationDate: LocalDate
) : GroceryItem(name, brand, price, quantity, weight)


class Fruits(
    name: String,
    brand: String,
    price: Double,
    quantity: Int,
    weight: Double,
    val type: String,
    val origin: String,
    val expirationDate: LocalDate
) : GroceryItem(name, brand, price, quantity, weight)


class Vegetables(
    name: String,
    brand: String,
    price: Double,
    quantity: Int,
    weight: Double,
    val type: String,
    val origin: String,
    val expirationDate: LocalDate
) : GroceryItem(name, brand, price, quantity, weight)


class Condiments(
    name: String,
    brand: String,
    price: Double,
    quantity: Int,
    weight: Double,
    val flavor: String,
    val expirationDate: LocalDate
) : GroceryItem(name, brand, price, quantity, weight)


class Furniture(
    val itemCode: String,
    val itemName: String,
    val price: Double,
    val material: String,
    val color: String
)


class Appliances(
    val itemCode: String,
    val itemName: String,
    val price: Double,
    val brand: String,
    val energyRating: String
)


class Clothes(
    val itemCode: String,
    val itemName: String,
    val price: Double,
    val size: String,
    val color: String,
    val material: String
)


class Pet(
    val name: String,
    val breed: String,
    val age: Int,
    val weight: Double
)


class SanitaryProducts(
    val name: String,
    val brand: String,
    val price: Double,
    val quantity: Int,)

class PersonalCare(
    var ingredients:String,
    var material:String,
    var brand:String ,
    var good2Health:String,)

class Meat(
    var freshness:String,
    var taste:String,
    var safety:String,
    var tenderness:String,
    var leanness:String,
    var price:String,
)
class KitchenWares(
    val usefulness:String,
    val price:String,
    val brand:String,
    val durability:String,
    val quality:String,
)

class Toys(
    val brand:String,
    val price:String,
    val durability:String,
    val quality:String,
    val safetiness:String,
)

class JunkFoods(
    val brand:String,
    val ingredients:String,
    val covering:String,
)

