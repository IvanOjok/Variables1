fun main() {
//    println("Enter year of birth")
//    val year = readln()
//    if (year == "2000") {
//        print("You're a Gen Z")
//    } else if(year == "1989") {
//        print("You're a Millennial")
//    } else {
//        print("You're a Gen X")
//    }

    /**
    1996-2015 - Gen Z
     1974-1995 - Millennial
     1960-1973 - Gen X
     0-1959 - Baby Boomer
     */

    //if and if else statement
//    println("Enter year of birth")
//    val year = readln().toInt()
//    if (year>=0 && year <= 1959) {
//        println("You are a Baby Boomer")
//    } else if(year>=1960 && year <= 1973) {
//        println("You are a Gen X")
//    } else if(year>=1974 &&  year <= 1995) {
//        println("You are a Millennial")
//    } else if(year>=1996 && year <= 2015) {
//        println("You are a Gen Z")
//    } else {
//        println("You are in the Future")
//    }

    val weather = readln()
    when(weather) {
        "rainy" -> print("Ground is getting wet")
        "sunny" -> print("Let's go to the beach")
        else -> print("Let's go jazz")
    }

    println("Enter year of birth")
    val year = readln().toInt()

    when(year) {
        in 0..1959 -> ""
    }


}