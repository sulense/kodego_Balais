package activity06_a

fun checkGrades(grades: List<Int>) {
    if (grades.size > 10) {
        throw InvalidInputException("Array size is greater than 10")
    }
    if (grades.contains(0)) {
        throw IncompleteGradesException("Array contains incomplete grades")
    }
}

class InvalidInputException(message: String): Exception(message)

class IncompleteGradesException(message: String): Exception(message)

fun main() {
    val grades = listOf(90, 80, 70, 60, 50, 40, 30, 20, 10, 0)

    try {
        checkGrades(grades)
    } catch (e: InvalidInputException) {
        println(e.message)
    } catch (e: IncompleteGradesException) {
        println(e.message)
    }
}


