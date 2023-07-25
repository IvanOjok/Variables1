import java.lang.Math.pow
import kotlin.math.sqrt

fun main() {
    //function call
    findTime()

    solveQuadratic()

    squareRootOfComplex()
}

fun findTime() {
    /**
    speed - 1000m/s
    acceleration - 25m/s/s
    distance - 5km
    time = ?
    speed = distance / time
    time = distance / speed

     */

    val speed = 1000
    val distance = 5*1000
    val time = distance / speed
    println("The time it will take will be $time")
}

fun solveQuadratic() {
    /**  x3+7x2+10x = 0
     *   x(x2+7x+10) = 0
     *   root1 = 0 or x2+7x+10 = 0
     *
     *   root2 = -b - sqrt(b2-4ac)/2a  a -> 1, b -> 7, c -> 10
     *   root3 = -b + sqrt(b2-4ac)/2a
     * */

    val root1 = 0
    var root2: Double = 0.0
    var root3:Double = 0.0
    val d = (7*7)-(4*1*10)
    if (d<0){
        print("No real  roots")
    }else {
        root2 = (-7 - sqrt(d.toDouble()))/2*1
        root3 = (-7 + sqrt(d.toDouble()))/2*1
    }


    println("The roots are x1 = $root1, x2 = $root2, x3 = $root3")

}

fun squareRootOfComplex() {
    val x = sqrt(-9.0)
    print(x)
}
