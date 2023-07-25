fun main() {

//    val add = { a:Int, b:Int -> print("The value is $a") }
//    add(6, 8)

    val addThreeNumbers = {a:Int, b:Int, c:Int -> a+b+c }
    val answer = addThreeNumbers(5, 8, 9)
    //println(answer)
    concatenateStrings("trees", "are green", eat)
}

val eat = {x:String, y:String -> print(x+y) }

fun concatenateStrings(a:String, b:String, x:(String, String)->Unit) {
    x(a, b)
}

//fun add(a:Int) { print("The value is $a") }
//write a function that has three parameters; two doubles and one character
//(*, +, -, /) and checks if third parameter
// == *, it will multiply the two doubles
// == +, it will add the two numbers
// == -, it will subtract the two numbers
// == /, it will divide the two numbers

