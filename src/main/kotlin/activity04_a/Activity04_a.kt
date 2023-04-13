package activity04_a

import mu.KotlinLogging

//Covered Topic(s) : Classes
//Instructions :
//1. Use class to represent the student rather string.Make sure the student has a firstName, lastName, nickName, id and year enrolled
//2. Update the searchStudentWildSearch to search for the wild string in the lastname, middle name, and firstname. Return the Arraylist of
//students that match the searched string, if there are no entries return an empty ArrayList.
//3. Add a function searchStudentWildSearch that will accept a string and either of the following values, lastname, middlename, nickname.
//This will search the specific wild string depending where it was mentioned to be searched for.
//Return the Arraylist of students that match the searched string, if there are no entries return an emptry ArrayList.

private val logger = KotlinLogging.logger {}

class Student(val firstName: String, val lastName: String, val nickName: String, val id: String, val yearEnrolled: Int)

fun searchStudentWildSearch(searchString: String, searchBy: String = "all", students: List<Student>): List<Student> {
    var matchingStudents = mutableListOf<Student>()
    for (student in students) {
        if (searchBy == "all" || searchBy == "firstName") {
            if (student.firstName.contains(searchString)) {
                matchingStudents.add(student)
            }
        }
        if (searchBy == "all" || searchBy == "lastName") {
            if (student.lastName.contains(searchString)) {
                matchingStudents.add(student)
            }
        }
        if (searchBy == "all" || searchBy == "nickName") {
            if (student.nickName.contains(searchString)) {
                matchingStudents.add(student)
            }
        }
    }
    return matchingStudents
}

//fun main(){
//
//    val students = listOf(
//        Student("Alice", "Johnson", "AJ", "123456", 2020),
//        Student("Bob", "Smith", "", "234567", 2021),
//        Student("Charlie", "Brown", "CB", "345678", 2019),
//        Student("Dave", "Lee", "", "456789", 2022),
//        Student("Emily", "Davis", "Em", "567890", 2020),
//    )
//
//    var running = true
//
//    while(running) {
//        logger.info { "Welcome to Student Search Engine" }
//        logger.info { "How do you want to search the student?" }
//        logger.info { "1. By first name" }
//        logger.info { "2. By last name" }
//        logger.info { "3. By nick name" }
//        logger.info { "4. all" }
//        logger.info { "5. quit" }
//        var choice = readLine()!!.toIntOrNull()
//
//        when (choice) {
//            1 -> {
//                logger.info{"Enter the name:"}
//                var name = readLine().toString()
//                if (name != null) {
//                    var matches = searchStudentWildSearch(name, "firstName", students)
//                    if (matches.isEmpty()) {
//                        logger.info { "Name not found!" }
//                    } else {
//                        logger.info { "Matches found:" }
//                        for (student in matches){
//                            logger.info{"${student.lastName}, ${student.firstName}; Nickname: ${student.nickName}, ID: ${student.id} Year Enrolled: ${student.yearEnrolled}"}
//                        }
//                    }
//                }
//            }
//
//
//            2 -> {
//                logger.info{"Enter the name:"}
//                var name = readLine().toString()
//                if (name != null) {
//                    var matches = searchStudentWildSearch(name, "lastName", students)
//                    if (matches.isEmpty()) {
//                        logger.info { "Name not found!" }
//                    } else {
//                        logger.info { "Matches found:" }
//                        for (student in matches){
//                            logger.info{"${student.lastName}, ${student.firstName}; Nickname: ${student.nickName}, ID: ${student.id} Year Enrolled: ${student.yearEnrolled}"}
//                        }
//                    }
//                }
//            }
//
//            3 -> {
//                logger.info{"Enter the name:"}
//                var name = readLine().toString()
//                if (name != null) {
//                    var matches = searchStudentWildSearch(name, "nickName", students)
//                    if (matches.isEmpty()) {
//                        logger.info { "Name not found!" }
//                    } else {
//                        logger.info { "Matches found:" }
//                        for (student in matches){
//                            logger.info{"${student.lastName}, ${student.firstName}; Nick name: ${student.nickName}, ID: ${student.id} Year Enrolled: ${student.yearEnrolled}"}
//                        }
//                    }
//                }
//            }
//
//            4 -> {
//                logger.info{"Enter the name:"}
//                var name = readLine().toString()
//                if (name != null) {
//                    var matches = searchStudentWildSearch(name, "all", students)
//                    if (matches.isEmpty()) {
//                        logger.info { "Name not found!" }
//                    } else {
//                        logger.info { "Matches found:" }
//                        for (student in matches){
//                            logger.info{"${student.lastName}, ${student.firstName}; Nick name: ${student.nickName}, ID: ${student.id} Year Enrolled: ${student.yearEnrolled}"}
//                        }
//                    }
//                }
//            }
//
//            5 -> {
//                running = false
//                logger.info { "Good Bye" }
//            }
//        }
//    }
//}
//
