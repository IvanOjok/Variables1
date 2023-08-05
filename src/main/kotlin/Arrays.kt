fun main() {
    //Non-primitive array
    val firstArray = arrayOf("Kenya", "Uganda", "Tanzania", 8, true)

    //primitive array
    val secondArray = Array<Int>(5, {6})


//    firstArray[0] = 9
//    firstArray[1] = 10
//    firstArray[2] = 9
//    firstArray[3] = 10
//    firstArray[4] = 9
//    firstArray[5] = 9

//    for (x in secondArray) {
//        println(x)
//    }
//
//    println(secondArray.size)

    val x = Array<String>(20, {""})
    val s = IntArray(20, {7})
    val d = DoubleArray(4)
    val k = CharArray(5)
    val c = BooleanArray(6)

    k[0] = 't'
    for (i in k) {
       // println(i)
    }

    x.forEach {
      //  print(it)
    }


    for (i in  100 downTo 0) {
        println(i)
    }


    //1. create an array of 50 integers and use a for loop to print out the names of the integer
    //2. create an array of 6 doubles and print out the sum of all elements in the array
    //3. in a class, there are five students; Ivan, Aron, Grace, Nisah, and Christine. Create an array
    //  in this order and afterwards, print the result of the elements in alphabetical order

}