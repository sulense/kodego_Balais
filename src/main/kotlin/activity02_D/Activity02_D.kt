package activity02_D

import java.math.BigDecimal


fun main() {
    var monetary1:Int?= null
    var monetary2:Int?= null
    var monetary3:Int?= null
    var monetary4:Int?= null
    var monetary5:Int?= null
    var totalMonetary:Int? =null

    println("Please enter the 5 monetary amount")

    print("1. ")
    monetary1 = readLine()!!.toIntOrNull()
    if (monetary1 == null) {
        print("Please use Number!")
        return
    }
    else (print("2. "))

    monetary2 = readLine()!!.toIntOrNull()
    if (monetary2 == null) {
        print("Please use Number!")
    }
    else (print("3. "))

    monetary3 = readLine()!!.toIntOrNull()
    if (monetary3 == null) {
        print("Please use Number!")
    }
    else (print("4. "))

    monetary4 = readLine()!!.toIntOrNull()
    if (monetary4 == null) {
        print("Please use Number!")
    }
    else (print("5. "))

    monetary5 = readLine()!!.toIntOrNull()
    if (monetary5 == null) {
        print("Please use Number!")
    }
    else (print("Divide by how many? "))

    var divideByHowMany = readLine()!!.toIntOrNull()
    if (divideByHowMany == null) { println("Please use Number!")
    }
    else if (divideByHowMany == 0){ println("undefined")
    }
    else totalMonetary = monetary1!! + monetary2!! + monetary3!! + monetary4!! + monetary5!!
    var result = totalMonetary!!.div(divideByHowMany!!)
    println(result)

}




