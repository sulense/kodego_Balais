package activity01

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Month
import java.time.format.DateTimeFormatter

fun main() {
//Student 1 Personal Information
    var student1LastName:String? = "Ried"
    var student1FirstName:String? = "James"
    var student1MiddleName:String? = "M."
    var student1:String = "$student1LastName, $student1FirstName $student1MiddleName"
    println(student1)

    var birthDay = LocalDate.of(2021, Month.SEPTEMBER, 21)
    var cellPhoneNumber:String = "09155555555"
    var parentsName:String? = "Nadin Ried"
    var emailAddress:String? = "Jamesnadin142@gmail.com"
    var homeAddres:String? = "Zone 10 Ph Street Cagayan de Oro"
    println("Birthday: $birthDay \n Cellphone Number: $cellPhoneNumber \n Parent's Name: $parentsName\n Email Address: $emailAddress \n Home Address: $homeAddres")
//student1 Daily Attendance
    println("Attendance:")
    var present:Boolean? = true
    var late:Boolean? = null
    if(present == true){ println("Present")}
    else if(late == true){println("Late")}
    else(println("Absent"))
    var dateTimeNow = LocalDateTime.now()
    var dateTimeFormat = DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm")
    var DailyAttendance = LocalDateTime.now().format(dateTimeFormat)
    println("Time in: $DailyAttendance")

//Performance
    var activityGrade:Double = 30.0
    var assignmentGrade:Double = 20.0
    var examGrade:Double = 50.0

    var subjectName:String? = "Science"
//Activities
    //activity1
    var activity1Title:String? = "Quiz 1"
    var passingScoreAct1:Short = 10
    var totalNumberAct1:Short= 15
    var scoreAct1:Short = 12
    //activity2
    var activity2Title:String? = null
    var passingScoreAct2:Short = 12
    var totalNumberAct2:Short = 20
    var scoreAct2:Short = 17
    //activity3
    var activity3Title:String? = null
    var passingScoreAct3:Short = 12
    var totalNumberAct3:Short = 20
    var scoreAct3:Short = 16
    //Total Score
    var totalNumberActs = ((totalNumberAct1 + totalNumberAct2 + totalNumberAct3)/3).toDouble()
    var totalScoreActs = ((scoreAct1 + scoreAct2 + scoreAct3)/3).toDouble()
    var actsGrade:Double = ((totalScoreActs/totalNumberActs)*activityGrade)
    println("Activity Grade: $actsGrade")

//Assignments
    //assignment1
    var assignment1Title:String? = null
    var passingScoreAss1:Short = 13
    var totalNumberAss1:Short= 20
    var scoreAss1:Short = 18
    //activity2
    var assignment2Title:String? = null
    var passingScoreAss2:Short = 10
    var totalNumberAss2:Short = 15
    var scoreAss2:Short = 15
    //assignment3
    var assignment3Tittle:String? = null
    var passingScoreAss3:Short = 10
    var totalNumberAss3:Short = 15
    var scoreAss3:Short = 15
    //Assignment Grade
    var passingScoreAss:Short? = null
    var totalNumberAss = ((totalNumberAss1 + totalNumberAss2 + totalNumberAss3)/3).toDouble()
    var totalScoreAss = ((scoreAss1 + scoreAss2 + scoreAss3)/3).toDouble()
    var AssGrade:Double = (totalScoreAss/totalNumberAss)*assignmentGrade
    println("Assignment Grade: $AssGrade")

//Exam
    var examTotalNumber:Double = 100.0
    var examScore:Double = 95.0
    var examPassingScore:Double = 75.0
    var examAverage = (examScore/examTotalNumber)*examGrade
    println("Exam Grade: $examAverage")
//Subject Grade
    var averagePassingGrade:Double = 0.0
    var averageGrade:Double = actsGrade + AssGrade + examAverage
    println("Subject Grade: $averageGrade")

}