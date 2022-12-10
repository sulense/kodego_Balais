package activity01_h

import java.util.*
import mu.KotlinLogging
private val logger = KotlinLogging.logger {}

//Create an application that will accept 2 Integers.
//
//It will identify the lower value and bigger value of the two inputs.
//
//Then, your application will print all the prime numbers starting from the lower number up to the largest number.
//
//Scope :
//String
//Loops
//
//Input:
//
//1, 4 -> 1, 2, 3
//
//10 -> 1, 2, 3, 5, 7



//Function to check Prime Number
fun findPrimeNo(number: Long): Boolean {
    if(number<2) return false
    for (i in 2.toLong()..number/2) {
        if (number % i == 0.toLong()) {
            return false
        }
    }
    return true
}

//Main Function, Entry Point of Program
fun main(arg: Array<String>) {

    var low = 0L
    var high = 0L
    //Input Stream
    print("Enter Input 1: ")
    var userInput1 = readLine()!!.toLong()

    print("Enter Input 2: ")
    var userInput2= readLine()!!.toLong()

    if(userInput1 > userInput2){
        low = userInput2
        high = userInput1

    }

    else if (userInput1 < userInput2){ low = userInput1
        high = userInput1}



    //Declare Mutable List to hold factors
    val list: MutableList<Long> = ArrayList()

    //iterate through loop start to end to find Prime  number in Range
        for (i in low..high) {
            if (findPrimeNo(i)) {
                list.add(i)
            }
        }


    println("Prime Numbers from $low to $high  : $list")
}