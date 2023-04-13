package activity06_a

import activity05_a.Status
import activity05_a.UnderGraduateStudent

//Using Activity 05 A
//Create a function that will check the student's grade.
//The function will accept an array with 10 entries only. It will throw the following the following exceptions
//if the array size is greater than 10 throw invalid input
//if the array contains 0 throw incomplete grades

fun main() {
    val student = UnderGraduateStudent(
        "John Rey",
        "M",
        "Balais",
        "123 St.",
        "01/01/1800",
        2020,
        1234,
        listOf("College of Science"),
        listOf("Biology"),
        2020,
        2024,
        Status.ONGOING)

    val grades = arrayOf(85, 90, 92, 88, 79, 91, 83, 87, 90, 94)

    try {
            val grade = checkGrade(grades)
            println("${student.firstName} ${student.lastName}'s grade is $grade")
        } catch (e: IllegalArgumentException) {
            println(e.message)
        }
    }


fun checkGrade(grades: Array<Int>): String {
    if (grades.size > 10) {
        throw IllegalArgumentException("Invalid input: array size must not exceed 10")
    }
    if (grades.isEmpty()) {
        throw IllegalArgumentException("Incomplete grades: array must not be empty")
    }
    for(grade in grades){
        if(grade !in 0 .. 100){
            throw IllegalArgumentException("Invalid Grade: Grade must not above 100 and below 0")
        }
    }

    val average = grades.average()

    return when {
        average >= 94 -> "4.0"
        average >= 89 -> "3.5"
        average >= 83 -> "3.0"
        average >= 78 -> "2.5"
        average >= 72 -> "2.0"
        average >= 66 -> "1.5"
        average >= 60 -> "1.0"
        else -> "0.0"
    }
}





