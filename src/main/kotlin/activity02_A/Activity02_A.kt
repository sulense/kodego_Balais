package activity02_A

import java.util.*
import mu.KotlinLogging
import kotlin.collections.ArrayList

private val logger = KotlinLogging.logger {}

//Implement Activity 01 -  A using data structure.
data class Student(
    var lastName: String?,
    var firstName: String?,
    var middleName: String?,
    var birthDay: Date?,
    var cellPhoneNumber: String?,
    var parentsName: String?,
    var emailAddress: String?,
    var homeAddress: String?,
    var dailyAttendance: Attendance?,
    var performance: Performance?
)

data class Attendance(
    var present: Boolean?,
    var late: Boolean?,
    var date: Date?
)

data class Performance(
    var subjectName: String?,
    var activities: List<Activity>?,
    var assignments: List<Assignment>?,
    var exam: Exam?
)

data class Activity(
    var title: String?,
    var passingScore: Double?,
    var totalNumber: Double?,
    var score: Double?
)

data class Assignment(
    var title: String?,
    var passingScore: Double?,
    var totalNumber: Double?,
    var score: Double?
)

data class Exam(
    var totalNumber: Double?,
    var score: Double?,
    var passingScore: Double?
)



fun main(){
    var student = Student(
        lastName = null,
        firstName = null,
        middleName = null,
        birthDay = null,
        cellPhoneNumber = null,
        parentsName = null,
        emailAddress = null,
        homeAddress = null,
        dailyAttendance = null,
        performance = null
    )

    student.performance = Performance(
        subjectName = "Math",
        activities = listOf(
            Activity(title = "Activity 1", passingScore = 70.0, totalNumber = 100.0, score = 85.0),
            Activity(title = "Activity 2", passingScore = 70.0, totalNumber = 100.0, score = 90.0),
            Activity(title = "Activity 3", passingScore = 70.0, totalNumber = 100.0, score = 75.0)
        ),
        assignments = listOf(
            Assignment(title = "Assignment 1", passingScore = 80.0, totalNumber = 100.0, score = 90.0),
            Assignment(title = "Assignment 2", passingScore = 80.0, totalNumber = 100.0, score = 85.0),
            Assignment(title = "Assignment 3", passingScore = 80.0, totalNumber = 100.0, score = 95.0)
        ),
        exam = Exam(totalNumber = 200.0, score = 170.0, passingScore = 140.0)
    )

}

//fun main() {
//    var student1 = Student(
//        lastName = null,
//        firstName = null,
//        middleName = null,
//        birthDay = null,
//        cellPhoneNumber = null,
//        parentsName = null,
//        emailAddress = null,
//        homeAddress = null,
//        dailyAttendance = null,
//        performance = null
//    )

//    student1.lastName = "Doe"
//    student1.firstName = "John"
//    student1.middleName = "W."
//    student1.birthDay = Date()
//    student1.cellPhoneNumber = "0922222222"
//    student1.parentsName = "Jane and Jack Doe"
//    student1.emailAddress = "john@gmail.com"
//    student1.homeAddress = "123 Main St., General Santos City, Philippines"
//    student1.dailyAttendance = Attendance(present = true, late = false, date = Date())
//    student1.performance = Performance(
//        subjectName = "Math",
//        activities = listOf(
//            Activity(title = "Activity 1", passingScore = 70.0, totalNumber = 100.0, score = 85.0),
//            Activity(title = "Activity 2", passingScore = 70.0, totalNumber = 100.0, score = 90.0),
//            Activity(title = "Activity 3", passingScore = 70.0, totalNumber = 100.0, score = 75.0)
//        ),
//        assignments = listOf(
//            Assignment(title = "Assignment 1", passingScore = 80.0, totalNumber = 100.0, score = 90.0),
//            Assignment(title = "Assignment 2", passingScore = 80.0, totalNumber = 100.0, score = 85.0),
//            Assignment(title = "Assignment 3", passingScore = 80.0, totalNumber = 100.0, score = 95.0)
//        ),
//        exam = Exam(totalNumber = 200.0, score = 170.0, passingScore = 140.0)
//    )
//
//    println("${student1.lastName}, ${student1.firstName} ${student1.middleName}")
//    println(student1.birthDay)
//    println(student1.cellPhoneNumber)
//    println(student1.parentsName)
//    println(student1.emailAddress)
//    println(student1.homeAddress)
//}
//
