package activity01_h

import mu.KotlinLogging

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




private val logger = KotlinLogging.logger {}
fun main() {
    logger.info{"Enter two integers:"}
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()

    val lower = if (a < b) a else b
    val upper = if (a < b) b else a


    logger.info{"Prime numbers between $lower and $upper are:"}
    for (num in lower..upper) {
        var returnSign = true
        if (num < 2) {
            returnSign = false
        }
        for (i in 2 until num) {
            if (num % i == 0) {
                returnSign = false
                break
            }
        }
        if (returnSign) {
            logger.info{num}
        }
    }
}

//    for (i in lower..upper){
//        if (i < 2) {
//         continue}
//        else {
//                if (i % 2 == 0) {
//                  continue
//                }else{
//                    logger.info{i}
//                }
//
//        }
//
//    }



//    for (i in lower..upper) {
//        if (isPrime(i)) {
//            logger.info{i}
//        }
//    }
//
//check kung prime number
//fun isPrime(n: Int): Boolean {
//    if (n < 2) {
//        return false
//    }
//    for (i in 2 until n) {
//        if (n % i == 0) {
//            return false
//        }
//    }
//    return true
//}


