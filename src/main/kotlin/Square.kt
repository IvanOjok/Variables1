import kotlin.math.sqrt

fun main() {
    // 2. c2 = a2 + b2. If a right-angled triangle has base 4cm, height 3cm
    //find the height of the hypotenuse of the triangle

    //c = square root(a2 + b2)

    val a = 4
    val b = 3
    val p = a*a + b*b
    val x = p.toDouble()
    val c = sqrt(x)
    print(c.toInt())
}