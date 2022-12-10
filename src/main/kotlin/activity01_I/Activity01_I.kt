package activity01_I

import mu.KotlinLogging
import java.util.*
import kotlin.collections.ArrayList

private val logger = KotlinLogging.logger {}

fun main() {

    var borrowerDetails:ArrayList<String> = arrayListOf()

    logger.info{"Name of borrower: "}
    var borrower:String = readln()
    borrowerDetails.add(borrower)

    logger.info{"Hi $borrower!, what book you want to borrow? "}
    var book:String = readln()
    borrowerDetails.add(book)


    logger.info{"Until when? "}
    var untilWhen:String = readln()
    borrowerDetails.add(untilWhen)

    logger.info{borrowerDetails}

}