package activity04_a

import mu.KotlinLogging
private val logger = KotlinLogging.logger {}

class Students{
    fun search(input:String){
        var student1 = arrayOf<String>("Daniel", "S.", "Rizal", "5472741", "Inggoy", "2022")
        var student2 = arrayOf<String>("Daniela", "P.", "Rizalian", "3472741", "Inggay", "2022")
        var student3 = arrayOf<String>("Danielabo", "W.", "Mercado", "2472741", "Onggie", "2022")
        var student4 = arrayOf<String>("Crisostomo", "L.", "Ibaka", "9472741", "labingyo", "2022")
        var student5 = arrayOf<String>("Maria", "Y.", "Maha", "7472741", "Wowex", "2022")

        when(input){
            in student1 -> logger.info{"First Name: ${student1[0]}, Middle Name: ${student1[1]}, Last Name: ${student1[2]}, ID: ${student1[3]}, Nickname: ${student1[4]}, Year Enrolled: ${student1[5]}"}
            in student2 -> logger.info{"First Name: ${student2[0]}, Middle Name: ${student2[1]}, Last Name: ${student2[2]}, ID: ${student2[3]}, Nickname: ${student2[4]}, Year Enrolled: ${student2[5]}"}
            in student3 -> logger.info{"First Name: ${student3[0]}, Middle Name: ${student3[1]}, Last Name: ${student3[2]}, ID: ${student3[3]}, Nickname: ${student3[4]}, Year Enrolled: ${student3[5]}"}
            in student4 -> logger.info{"First Name: ${student4[0]}, Middle Name: ${student4[1]}, Last Name: ${student4[2]}, ID: ${student4[3]}, Nickname: ${student4[4]}, Year Enrolled: ${student4[5]}"}
            in student5 -> logger.info{"First Name: ${student5[0]}, Middle Name: ${student5[1]}, Last Name: ${student5[2]}, ID: ${student5[3]}, Nickname: ${student5[4]}, Year Enrolled: ${student5[5]}"}
            else -> logger.error{"Student Not Found"}
        }
    }
}

fun main() {
    val s = Students()

    while (true) {
        logger.info{"Search Student: "}
        var input:String? = null
         input = readLine().toString()
        if (input == null) {
            break
        }
        s.search(input)
    }
}