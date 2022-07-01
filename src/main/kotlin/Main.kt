fun main(){

    val x = minSplit()

    println("<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>")
    println("coins $x")
    println("<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>")



}

fun minSplit(): Int {

    //set amount
    val geoTetri = 104

    var change = 0
    val a = geoTetri / 50
    change = geoTetri % 50
    val b = change / 20
    change %= 20
    val c = change / 10
    change %= 10
    val d = change / 5
    change %= 5
    val e = change/1
    change%= 1

    return a + b + c + d + e

}


