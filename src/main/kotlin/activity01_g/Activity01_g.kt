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

   while(true){
       var userInput:String = readLine().toString()
       if(userInput.reversed() == userInput){
           logger.info{"Palindrome"}
       }
       else logger.info{"Not a Palindrome"}
   }
}