package activity01_f

import mu.KotlinLogging

//Create an application that will accept 2 string inputs.
//
//Your application will print all unique characters in both Strings.
//
//Union of Unique characters in both String

//Example :
//String 1 : Bird
//String 2 : Cat
//Unique : BirdCat
//
//Example :
//String 1 : Bird
//String 2 : BigBird
//Unique : gBird

//Example :
//String 1 : Eat
//String 2 : Tea
//Unique : Tea

private val logger = KotlinLogging.logger {}




fun main() {
    logger.info{"Input1:"}
    val input1 = readLine().toString()

    logger.info{"Input2:"}
    val input2 = readLine().toString()

    var uniqueChars = ""


    for (char in input1) {
        if (!uniqueChars.contains(char)) {
            uniqueChars += char
        }
    }

    for (char in input2) {
        if (!uniqueChars.contains(char)) {
            uniqueChars += char
        }
    }

    logger.info{"Unique characters: $uniqueChars"}
}

//fun main() {
//    var uniqueChars = ""
//
//    logger.info{"Input 1: "}
//    var input1 = readLine().toString()
//
//    logger.info { "Input 2: " }
//    var input2 = readLine().toString()
//
//    for(x in input1){
//        if(x !in input2){
//            uniqueChars += x.toString()
//        }
//    }
//
//    for(x in input2) {
//        if (x !in input1) {
//            uniqueChars += x.toString()
//        }
//    }
//    logger.info{"Unique characters are: $uniqueChars"}
//}