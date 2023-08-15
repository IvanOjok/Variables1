//Object is an instance of class
//class Car {
//    var color:String = ""
//    var brand:String = "Benz"
//    var model:String = ""
//    var year:String = ""
//    var bond:String = ""
//    var hosePower:Int = 0
//    var engineSize: Float = 0.0f
//    var clutch:Boolean ?= null
//}
//
//fun main() {
//    val rangeRover = Car()
//    rangeRover.color = "Black"
//    rangeRover.model = "Range Rover Sport"
//    rangeRover.clutch = true
//
//    println(rangeRover.engineSize)
//
//    val tesla = Car()
//    tesla.clutch = false
//
//}


//Primary constructor
//class Car(var color:String, var model:String = "Uganda") {
//    var brand:String = "Benz"
//    var year:String = ""
//    var bond:String = model
//    var hosePower:Int = 0
//    var engineSize: Float = 0.0f
//    var clutch:Boolean ?= null
//}
//
//fun main() {
//    val rangeRover = Car("")
//    rangeRover.color = "Black"
//    println(rangeRover.model)
//    rangeRover.model = "Range Rover Sport"
//    //rangeRover.clutch = true
//    println(rangeRover.model)
//
//    val tesla = Car("Black")
//    tesla.clutch = false
//
//}

//secondary constructor
//class Car {
//    var hosePower:Int = 0
//    var engineSize: Float = 0.0f
//    var clutch:String ?= null
//
//    constructor()
//
//    constructor(color:String, model:String)
////    {
////        this.clutch = super.toString()
////        super.toString()
////    }
//
//    constructor(brand:String, year:String, bond:String)
//
//    fun calculatePower(): String {
//        return "Power of a $engineSize car is 44Wart"
//    }
//}

//fun main() {
//    val rangeRover = Car("Red", "Benz")
//    val tesla = Car("Gx", "2022", "Nk")
//
//    var vitz = Car()
//    vitz.engineSize = 23.9f
//
//    val p = vitz.calculatePower()
//    print(p)
//
//}


//Inheritance
open class AppCompatActivity {
    open fun onCreate(savedInstanceBundle:String) {
        println("I'm in the oncreate method of AppCompatActivity")
    }
}

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceBundle: String) {
        super.onCreate(savedInstanceBundle)

        print("DFSadfewqeds")
    }
}



fun main() {
    val A = MainActivity()
    A.onCreate("Ths")
}


//Create a class Color having attributes name, symbol and hex code and
// a function that returns the three attributes as a string

//Create a class Rainbow that inherits from Color and modifies the function in
//class Color to return all the colors of a rainbow and prints the output
