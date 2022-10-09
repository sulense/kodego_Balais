package activity01

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Month
import java.time.format.DateTimeFormatter

fun main() {
//Student 1 Personal Information
    var student1LastName:String? = null
    var student1FirstName:String? = null
    var student1MiddleName:String? = null
    var student1:String = "$student1LastName, $student1FirstName $student1MiddleName"
    println(student1)

    var birthDay = LocalDate.of(2021, Month.SEPTEMBER, 21)
    var cellPhoneNumber:Long? = null
    var parentsName:String? = null
    var emailAddress:String? = null
    var homeAddres:String? = null
//student1 Daily Attendance
    var present:Boolean? = null
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

    var subjectName:String? = null
//Activities
    //activity1
    var activity1Title:String? = null
    var passingScoreAct1:Short = 0
    var totalNumberAct1:Short= 0
    var scoreAct1:Short = 0
    //activity2
    var activity2Title:String? = null
    var passingScoreAct2:Short = 0
    var totalNumberAct2:Short = 0
    var scoreAct2:Short = 0
    //activity3
    var activity3Title:String? = null
    var passingScoreAct3:Short = 0
    var totalNumberAct3:Short = 0
    var scoreAct3:Short = 0
    //Total Score
    var passingScore:Short? = null
    var totalNumberActs = ((totalNumberAct1 + totalNumberAct2 + totalNumberAct3)/3).toDouble()
    var totalScoreActs = ((scoreAct1 + scoreAct2 + scoreAct3)/3).toDouble()
    var actsGrade:Double = ((totalScoreActs/totalNumberActs)*activityGrade)
    println("Activity Grade: $actsGrade")

//Assignments
    //assignment1
    var assignment1Title:String? = null
    var passingScoreAss1:Short = 0
    var totalNumberAss1:Short= 0
    var scoreAss1:Short = 0
    //activity2
    var assignment2Title:String? = null
    var passingScoreAss2:Short = 0
    var totalNumberAss2:Short = 0
    var scoreAss2:Short = 0
    //assignment3
    var assignment3Tittle:String? = null
    var passingScoreAss3:Short = 0
    var totalNumberAss3:Short = 0
    var scoreAss3:Short = 0
    //Assignment Grade
    var passingScoreAss:Short? = null
    var totalNumberAss = ((totalNumberAss1 + totalNumberAss2 + totalNumberAss3)/3).toDouble()
    var totalScoreAss = ((scoreAss1 + scoreAss2 + scoreAss3)/3).toDouble()
    var AssGrade:Double = (totalScoreAss/totalNumberAss)*assignmentGrade
    println("Assignment Grade: $AssGrade")

//Exam
    var examTotalNumber:Double = 0.0
    var examScore:Double = 0.0
    var examPassingScore:Double = 0.0
    var examAverage = (examScore/examTotalNumber)*examGrade
    println("Exam Grade: $examAverage")
//Subject Grade
    var averagePassingGrade:Double = 0.0
    var averageGrade:Double = actsGrade + AssGrade + examAverage
    println("Subject Grade: $averageGrade")

}