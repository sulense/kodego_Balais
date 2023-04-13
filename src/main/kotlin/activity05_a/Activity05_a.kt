package activity05_a

import java.util.*

//Scope : Use inheritance on Students
//Create a person class with firstname, middlename, lastname, address and birthday.
//Create a Student class that inherits the Person class. A student has a year he/she entered the school. A student has an ID.
//Create a CertificateStudent, UnderGraduateStudent, MasterStudent, and GraduateStudent
//A student has different statuses
//Status : Leave of Absence, Ongoing, Graduated, Will Begin, Unknown, Shifted,
//The Certificate Student has a list of short courses he or she has gotten.
//Example:
//Student 1, Computer Technician, Network Technician, Electrical Technician
//Student 2, Public Speaking, Debate, Advertising Article
//The Undergraduate Student has a list of college(s) he or she belongs to, there is a year he or she joined the college, there is a
//list degrees he or she is taking, there is a start and year of the degree, there is also different statuses.
//Example :
//Undergraduate Student 1,  College of Engineering, Bachelor of Interior Design, 2020(start), 2022(end)
//Note : end will only contain a value if he or she is done with the course
//The Master Student has a list of college(s) he or she belongs to, there is a year he or she joined the college, and has name of the
//master degree he or she is getting.



open class Person(
    val firstName: String,
    val middleName: String,
    val lastName: String,
    val address: String,
    val birthday: String
){}

open class Student(
    firstName: String,
    middleName: String,
    lastName: String,
    address: String,
    birthday: String,
    val yearEntered: Int,
    val id: Int
): Person(firstName, middleName, lastName, address, birthday){}

enum class Status {
    LEAVE_OF_ABSENCE, ONGOING, GRADUATED, WILL_BEGIN, UNKNOWN, SHIFTED
}

class CertificateStudent(
    firstName: String,
    middleName: String,
    lastName: String,
    address: String,
    birthday: String,
    yearEntered: Int,
    id: Int,
    val shortCourses: List<String>
): Student(firstName, middleName, lastName, address, birthday, yearEntered, id){}

class UnderGraduateStudent(
    firstName: String,
    middleName: String,
    lastName: String,
    address: String,
    birthday: String,
    yearEntered: Int,
    id: Int,
    val colleges: List<String>,
    val degrees: List<String>,
    val startYear: Int,
    val endYear: Int?,
    val status: Status
): Student(firstName, middleName, lastName, address, birthday, yearEntered, id){}

class MasterStudent(
    firstName: String,
    middleName: String,
    lastName: String,
    address: String,
    birthday: String,
    yearEntered: Int,
    id: Int,
    val colleges: List<String>,
    val yearJoined: Int,
    val masterDegree: String
): Student(firstName, middleName, lastName, address, birthday, yearEntered, id){}

class GraduateStudent(
    firstName: String,
    middleName: String,
    lastName: String,
    address: String,
    birthday: String,
    yearEntered: Int,
    id: Int,
    val status: Status
): Student(firstName, middleName, lastName, address, birthday, yearEntered, id){}


