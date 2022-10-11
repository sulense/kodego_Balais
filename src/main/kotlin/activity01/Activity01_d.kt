package activity01

fun main() {
    var monetary1:Int? = null
    var monetary2:Int? = null
    var monetary3:Int? = null
    var monetary4:Int? = null
    var monetary5:Int? = null

    var divideByHowMany:Int? = null

    println("Please enter the 5 monetary amount")
    print("1.")
    monetary1 = readLine()!!.toInt()
    print("2.")
    monetary2 = readLine()!!.toInt()
    print("3.")
    monetary3 = readLine()!!.toInt()
    print("4.")
    monetary4 = readLine()!!.toInt()
    print("5.")
    monetary5 = readLine()!!.toInt()

    print("Divide by how many? ")
    divideByHowMany = readLine()!!.toInt()

    var totalMonetary = monetary1 + monetary2 + monetary3 + monetary4 + monetary5
    var result = totalMonetary/divideByHowMany
    println(result)
}