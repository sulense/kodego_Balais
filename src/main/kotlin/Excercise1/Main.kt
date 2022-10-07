package Excercise1

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Month
import java.time.format.DateTimeFormatter
import java.util.Date

fun main() {
//Application for Employment
    var positionApplying = "Chef"
    var desiredSalary = 10000
    var dateAvail4work =  LocalDateTime.of(2022, Month.JANUARY, 5, 8, 10)
    var dateFormat1 = DateTimeFormatter.ofPattern("M/d/y H:m:ss")
//PERSONAL INFORMATION
    var lastName = "Balais"
    var firstName = "John Rey"
    var middleName = "Medina"
    var userAddress = "somewhere down the road"
    var state = "N/A"
    var Zip = "400"
    var homePhone = "7463764786"
    var cellPhone = "0922222222"
    var socialSecuritySys = "657676"
    var usCitizen = "Yes"
    var beenConvicted = "No"
    var ifSelectedDrugTest = "Yes"
//EDUCATION
    var schoolName = "Central Elementary School"
    var Location = "Zamboanga Santos City"
    var yearsAttended = "2001-2022"
    var degreeRecieved = "BSEd"
    var Major = "Filipino"

    println("Application for Employment")
    println("Position You Are Applying For: $positionApplying")
    println("Desired Salaray: $desiredSalary")
    println("Date Available For Work: "+ dateAvail4work.format(dateFormat1))

    println("PERSONAL INFORMATION")
    println("Last Name: $lastName")
    println("First Name: $firstName")
    println("Middle Name: $middleName")
    println("Address: $userAddress")
    println("State: $state")
    println("Zip: $Zip")
    println("Home Phone: $homePhone")
    println("Cellphone: $cellPhone")
    println("Social Security Nummer: $socialSecuritySys")
    println("Are you a U.S. Citizen? $usCitizen")
    println("Have you ever been convicted of a felony? $beenConvicted")
    println("If selected for employment are you willing to submit to a pre-employment drug screening test? $ifSelectedDrugTest ")

    println("EDUCATION")
    println("School: $schoolName")
    println("Location: $Location")
    println("Years Attended: $yearsAttended")
    println("Degree Recieved: $degreeRecieved")
    println("Major: $Major")
}