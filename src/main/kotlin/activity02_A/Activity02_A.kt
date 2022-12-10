package activity02_A

import java.util.*
import mu.KotlinLogging
private val logger = KotlinLogging.logger {}


fun main() {
//Student 1 Personal Information
    var studentDetails = mutableMapOf(("Last Name"  to  ""), ("First Name" to ""),("Middle Name" to ""),
        ("Birth Day" to ""),("Cellphone Number" to ""), ("Parents Name" to ""), ("Email Address" to ""), ("Home Address" to ""),
        ("Student Attendance" to ""), ("Student General Average" to ""))

    logger.info{"Last Name"}
    var lastName = readln()
    studentDetails.put("Last Name", lastName)

    logger.info{"First Name"}
    var firstName = readln()
    studentDetails.put("First Name", firstName)

    logger.info{"Middle Name"}
    var middleName = readln()
    studentDetails.put("Middle Name", middleName)

    logger.info{"Birth Day"}
    var birthDay = readln()
    studentDetails.put("Birth Day", birthDay)

    logger.info{"Cellphone Number"}
    var cellPhoneNumber = readln()
    studentDetails.put("Cellphone Number", cellPhoneNumber)

    logger.info{"Parents Name"}
    var parentsName = readln()
    studentDetails.put("Parents Name", parentsName)

    logger.info{"Email Address"}
    var emailAddress = readln()
    studentDetails.put("Email Address", emailAddress)

    logger.info{"Home Address"}
    var homeAddress = readln()
    studentDetails.put("Home Address", homeAddress)

    logger.info{"Student Attendance"}
    var studentAttendance = readln()
    studentDetails.put("Student Attendance", studentAttendance)

    logger.info{"Student General Average"}
    var studentGrade = readln()
    studentDetails.put("Student General Average", studentGrade)

    logger.info{studentDetails}
}
