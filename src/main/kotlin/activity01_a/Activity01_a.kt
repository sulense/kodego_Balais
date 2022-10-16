package activity01_a


import java.util.*

fun main() {
//Student 1 Personal Information
    var student1LastName:String? = null
    var student1FirstName:String? = null
    var student1MiddleName:String? = null
    var student1:String = "$student1LastName, $student1FirstName $student1MiddleName"
    println(student1)

    var birthDay:Date? = null
    var cellPhoneNumber:String? = null
    var parentsName:String? = null
    var emailAddress:String? = null
    var homeAddres:String? = null
//student1 Daily Attendance
    var present:Boolean? = null
    var late:Boolean? = null
    var DailyAttendance: Date? = null

//Performance
    var activityGrade:Double? = null
    var assignmentGrade:Double? = null
    var examGrade:Double? = null

    var subjectName:String? = null
//Activities
    //activity1
    var activity1Title:String? = null
    var passingScoreAct1:Double? = null
    var totalNumberAct1:Double? = null
    var scoreAct1:Double? = null
    //activity2
    var activity2Title:String? = null
    var passingScoreAct2:Double? = null
    var totalNumberAct2:Double? = null
    var scoreAct2:Double? = null
    //activity3
    var activity3Title:String? = null
    var passingScoreAct3:Double? = null
    var totalNumberAct3:Double? = null
    var scoreAct3:Double? = null

//Assignments
    //assignment1
    var assignment1Tittle:String? = null
    var passingScoreAss1:Double? = null
    var totalNumberAss1:Double? = null
    var scoreAss1:Double? = null
    //activity2
    var assignment2Tittle:String? = null
    var passingScoreAss2:Double? = null
    var totalNumberAss2:Double? = null
    var scoreAss2:Double? = null
    //assignment3
    var assignment3Tittle:String? = null
    var passingScoreAss3:Double? = null
    var totalNumberAss3:Double? = null
    var scoreAss3:Double? = null


//Exam
    var examTotalNumber:Double? = null
    var examScore:Double? = null
    var examPassingScore:Double? = null


}