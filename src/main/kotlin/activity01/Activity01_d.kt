package activity01

import java.math.BigDecimal
import java.util.*


fun main() {
    var monetary1:BigDecimal?= null
    var monetary2:BigDecimal?= null
    var monetary3:BigDecimal?= null
    var monetary4:BigDecimal?= null
    var monetary5:BigDecimal?= null

    println("Please enter the 5 monetary amount")

    print("1. ")
     monetary1 = readLine()!!.toBigDecimalOrNull()
    if (monetary1 == null) {
        print("Please use Number!")
        }
    else (print("2. "))

    monetary2 = readLine()!!.toBigDecimalOrNull()
    if (monetary2 == null) {
        print("Please use Number!")
    }
    else (print("3. "))

     monetary3 = readLine()!!.toBigDecimalOrNull()
    if (monetary3 == null) {
        print("Please use Number!")
    }
    else (print("4. "))

     monetary4 = readLine()!!.toBigDecimalOrNull()
    if (monetary4 == null) {
        print("Please use Number!")
    }
    else (print("5. "))

      monetary5 = readLine()!!.toBigDecimalOrNull()
    if (monetary5 == null) {
        print("Please use Number!")
    }
    else (print("Divide by how many? "))

   var divideByHowMany = readLine()!!.toBigDecimalOrNull()
    if (divideByHowMany == null) { println("Please use Number!")
    }
    else println("Good Job!")

    val totalMonetary = (((monetary1?.plus(monetary2!!))?.plus(monetary3!!))?.plus(monetary4!!))?.plus(monetary5!!)
    var result= totalMonetary?.div(divideByHowMany!!)
    println(result)

}

