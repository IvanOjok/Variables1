fun main() {
//    println("Enter first number from Keyboard")
//    val d = readln().toInt()
//    println("Enter second number from Keyboard")
//    val e = readln().toInt()
//
//    val sum = d + e
//    print(sum)


    //windows - ctrl + x + enter
    // cmd + D

    //readln() - returns string that's not nullable
//    println("Enter first number from Keyboard")
//    val x = readln()
//    val d = readLine()
//    println(d)


    var firstNumber:String ?= null
    firstNumber = readLine()
    println(firstNumber)
    //safe call - ?.
    //non-null asserted call requires the variable to not be null or else it will crash
    print(firstNumber?.length)

}