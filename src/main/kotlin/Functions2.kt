fun main() {
    println("Enter the first number:")
    val firstNumber = readln().toInt()
    println("Enter the second number:")
    val secondNumber = readln().toInt()

    val answer = addTwoNumbers(firstNumber, secondNumber) * 500
    print("The sum of $firstNumber and $secondNumber is: $answer")
}

fun addTwoNumbers(a:Int, b:Int): Int {
    val x = a + b
    multiply(x)
    return x
}

fun multiply(x:Int){
    val y = 50 * x
}