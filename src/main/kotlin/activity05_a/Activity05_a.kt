package activity05_a

//Person class with five properties: firstName, middleName, lastName, address, and birthday.
open class Person(val firstName: String, val middleName: String, val lastName: String, val address: String, val birthday: String){}

//The Student class inherits from the Person class and adds two additional properties: yearEntered and id.
open class Student(firstName: String, middleName: String, lastName: String, address: String, birthday: String, val yearEntered: Int, val id: Int): Person(firstName, middleName, lastName, address, birthday){}

enum class Status {
    LEAVE_OF_ABSENCE, ONGOING, GRADUATED, WILL_BEGIN, UNKNOWN, SHIFTED
}

//The CertificateStudent class inherits from the Student class and adds a property for a list of short courses.
class CertificateStudent(firstName: String, middleName: String, lastName: String, address: String, birthday: String, yearEntered: Int, id: Int, val shortCourses: List<String>): Student(firstName, middleName, lastName, address, birthday, yearEntered, id){}

//The UndergraduateStudent class inherits from the Student class and adds properties for a list of colleges, year joined, a list of degrees, start and end year for the degree, and a status.
//The end year is nullable because it will only contain a value if the student has completed the course.
class UndergraduateStudent(firstName: String, middleName: String, lastName: String, address: String, birthday: String, yearEntered: Int, id: Int, val colleges: List<String>, val yearJoined: Int, val degrees: List<String>, val startYear: Int, val endYear: Int?, val status: Status): Student(firstName, middleName, lastName, address, birthday, yearEntered, id){}


//The MasterStudent class inherits from the Student class and adds properties for a list of colleges, year joined, and the name of the master degree.
class MasterStudent(firstName: String, middleName: String, lastName: String, address: String, birthday: String, yearEntered: Int, id: Int, val colleges: List<String>, val yearJoined: Int, val masterDegree: String): Student(firstName, middleName, lastName, address, birthday, yearEntered, id){}

//The GraduateStudent class inherits from the Student class and adds a property for a status.
class GraduateStudent(firstName: String, middleName: String, lastName: String, address: String, birthday: String, yearEntered: Int, id: Int, val status: Status): Student(firstName, middleName, lastName, address, birthday, yearEntered, id){}
