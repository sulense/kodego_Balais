package activity01_d

import mu.KotlinLogging

//Create an application that will accept 5 monetary amounts.
//After the input is done, the user will be asked “Divide the value by how many?”. It will only accept an Integer as input.
//The total of the 5  input will be divided by the answer in the second question input.
//Note: Error checking must be done.

private val logger = KotlinLogging.logger {}
fun main() {

    var sumInputMonetary = 0.0
    var inputCount = 0

    if(inputCount == 0){
        logger.info {"Input monetary amount: "}
        var input = readLine()!!.toDoubleOrNull()
        if (input != null) {
            sumInputMonetary += input
            inputCount++
        } else {
            logger.info{"Invalid input."}
        }
    }

    if(inputCount == 1){
        logger.info {"Input monetary amount: "}
        var input = readLine()!!.toDoubleOrNull()
        if (input != null) {
            sumInputMonetary += input
            inputCount++
        } else {
            logger.info{"Invalid input. Please enter a valid monetary amount."}
        }
    }

     if(inputCount == 2){
        logger.info {"Input monetary amount: "}
        var input = readLine()!!.toDoubleOrNull()
        if (input != null) {
            sumInputMonetary += input
            inputCount++
        } else {
            logger.info{"Invalid input. Please enter a valid monetary amount."}
        }
    }

     if(inputCount == 3){
        logger.info {"Input monetary amount: "}
        var input = readLine()!!.toDoubleOrNull()
        if (input != null) {
            sumInputMonetary += input
            inputCount++
        } else {
            logger.info{"Invalid input. Please enter a valid monetary amount."}
        }
    }
     if(inputCount == 4){
        logger.info {"Input monetary amount: "}
        var input = readLine()!!.toDoubleOrNull()
        if (input != null) {
            sumInputMonetary += input
            inputCount++
        } else {
            logger.info{"Invalid input. Please enter a valid monetary amount."}
        }
    } else {logger.info{"Invalid input."}}


    if (inputCount == 4){
        logger.info{"Divide the value by how many? "}
        val divisor = readLine()!!.toIntOrNull()
        if (divisor != null && divisor > 0) {
            val total = sumInputMonetary
            val result = total / divisor
            logger.info{"The total of the 5 input is $total, and when divided by $divisor, the result is $result."}
        } else {
            logger.info{"Invalid input. Please enter a positive integer."}
        }
    }

}





