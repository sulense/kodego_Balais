package activity02_D

import mu.KotlinLogging

//Implement Activity 01 - D using data structure.

private val logger = KotlinLogging.logger {}
fun main() {

    val inputList = mutableListOf<Double>()
    var inputCount = 0

    while (inputCount < 5) {
        logger.info{"Enter a monetary amount: "}
        val input = readLine()!!.toDoubleOrNull()
        if (input != null) {
            inputList.add(input)
            inputCount++
        } else {
            logger.info{"Invalid input. Please enter a valid monetary amount."}
        }
    }

    logger.info{"Divide the value by how many? "}
    val divisor = readLine()!!.toIntOrNull()
    if (divisor != null && divisor > 0) {
        val total = inputList.sum()
        val result = total / divisor
        logger.info{"The total of the 5 input is $total, and when divided by $divisor, the result is $result."}
    } else {
        logger.info{"Invalid input. Please enter a positive integer."}
    }
}









