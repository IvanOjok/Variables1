//mutable or immutable multiple number of elements
//lists, sets, maps

fun main() {

//    //immutable list
//    val myList = listOf(1, 4, 6, 7, 9, "rest", "tress")
//    val list = List<Int>(45,  {9})
//
//    //mutable list
//    val mList = mutableListOf("4", "5", "7", "6")
//    mList.add(4, "tree")
//    mList.add(5, "tree5")
//    mList.add( "tree6")
//    mList.add("")
//
//    val mList2 = MutableList<Int>(4){ 9 }
////    mList2.add(7)
////    mList2.add(90)
////    mList2.forEach{
////        println(it)
////    }
//
//    for (i in 9 downTo 2) {
//        mList2.add(i)
//    }
//    for (x in mList2) {
//        println(x)
//    }

    /// Sets
//    val set1 = setOf("3", 8, "7", "tree", "3", 9, "7", "6", "tree",)
//    val set2:Set<Int> = setOf(4, 7, 2, 8)
//
//    set1.forEach {
//       // println(it)
//    }
//
//    val mSet1 = mutableSetOf("ree", "tree", 4, 6, 4, "tree", "ree")
//    val mSet2:MutableSet<Int> = mutableSetOf(5)
//    mSet1.add("tree")
//    mSet1.add(5)
//    mSet1.forEach {
//        println(mSet1)
//        println(it)
//    }

    //map
//    val map1 = mapOf(1 to "one", 2 to "two", "3" to "three" )
//    for (i in map1){
//        //println(i.value)
//    }
//
//    val myMap = mutableMapOf("1" to 1, "two" to 2, 3 to "three")
//    myMap.put("1", "3")
//    myMap.replace(3, "thirty")
//    //mMap1.values.add("r")
//    for (i  in myMap) {
//        println(i)
//    }


    //1. Create a list of 10 integers; 89, 45, 23, 5, 67, 12, 55, 89, 54, 55
   // and print them out in ascending order
    //2. assuming a group A contains elements {a, b, c, d, e , a, g, r, f}
    //  group B contains {ant, bee, elephant, dog, cat}. Create a map that links the two
//  groups using their first characters
    //3. after implementing 2 above, add five entries that map five unique characters to
// the respective animal name

    val groupA = listOf("a", "b", "c", "d", "e" , "a", "g", "r", "f")
    val groupB = listOf("ant", "bee", "elephant", "dog", "cat", "apple")
    val map = mutableMapOf<String, String>()
    for(i in groupA){
        println("i is $i")
        for(j in groupB) {
            println("j is $j")
            if (i.first() == j.first()) {
                println("similar found; $i == $j")
                map.put(i, j)
            }
//            else {
//                map.put(i, "_")
//            }
        }
    }

    map.forEach {
        println(it)
    }
    map.put("r", "rat")


    val c = mapOf(1 to 1, 1 to 2, 3 to 3, 4 to 4)
    c.forEach {
        println(it)
    }

}
