package activity01_g

import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

/*Create an application that will accept 1 string.

Your application will print “Palindrome” if the string is a palindrome.
Scope :
String
Loops
Ex :
GIRAFARIG - Palindrome
101 - Palindrome
RACECAR - Palimdrome
GATE - Not Palindrome
*/

fun main() {

   while(true) {
       logger.info { "Enter a Word: " }
       var input: String = readLine().toString()
            if(input == "" || input == null){
                logger.info{"You didn't enter any word"}
            } else{
               if (input.reversed() == input) {
               logger.info { "${input.uppercase()} is a Palindrome" }
           } else logger.info { "${input.uppercase()} is not a Palindrome" }
       }
   }
}