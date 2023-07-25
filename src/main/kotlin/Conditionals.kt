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


    /**
    1. Solve the equation x2+10x+25 = 0  - x = (-b+-Sqrt(b2-4ac))/2a
     2. A car is moving at a speed of 1000m/s at an acceleration of 25m/s/s
     Find the time it will take to move a distance of 5km
    Hint - acceleration = speed/time
           speed = distance/time

     3. A person has four option of choosing between;
    pizza, chicken, pancakes or cake. If they choose pizza, they'll go to pizza hut,
     if chicken, they'll go to kfc, if pancakes, they'll go to foodhub,
     if cake, they'll go to cakely. Write
     -a program using an if statement that captures the persons choice and prints the
     selected restaurant
     -same program using a when statement

     4. Solve the equation x3+7x2+10x = 0  x(x2+7x+10)

     5. A person is moving to his village with a car moving at 20km/h and He has many
    alternative routes.
    If he uses route1, he'll move a distance of 5000km
    If he uses route2, he'll move a distance of 25000km
    If he uses route3, he'll move a distance of 50000km
    If he uses another, he'll move a distance of 10000km

     Find the time it will take him to reach the village using the separate routes
     -using an if statement
     -using a when statement

    */

    val c = 4

}