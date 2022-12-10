package activity05_a

open class Person( var firstName:String,var middleName:String, var lastName:String, var address:String, var birthday:String){

}

open class Student(firstName:String, middleName:String, lastName:String, address:String, birthday:String,var schoolYear:String,var iD:String): Person(firstName,middleName,lastName,address,birthday){

}
class Status(var leaveOfAbsence:Boolean, var ongoing:Boolean, var graduated:Boolean,var willBegin:Boolean, var Unknown:Boolean, var Shifted:Boolean ){}

class CertificateStudent(firstName:String, middleName:String, lastName:String, address:String, birthday:String,schoolYear:String,iD:String, var courses:String):Student(firstName, middleName, lastName, address, birthday,schoolYear,iD){
}
class UnderGraduateStudent(firstName:String, middleName:String, lastName:String, address:String, birthday:String,schoolYear:String,iD:String, var College:String):Student(firstName, middleName, lastName, address, birthday,schoolYear,iD){
}
class MasterStudent(firstName:String, middleName:String, lastName:String, address:String, birthday:String,schoolYear:String,iD:String, var college:String):Student(firstName, middleName, lastName, address, birthday,schoolYear,iD){
}
class GraduateStudent(firstName:String, middleName:String, lastName:String, address:String, birthday:String,schoolYear:String,iD:String, var yearGraduated:String):Student(firstName, middleName, lastName, address, birthday,schoolYear,iD){
}