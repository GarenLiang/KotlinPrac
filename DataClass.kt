import java.math.BigInteger
import java.util.*

data class Laptop (val brand:String, val price:Int) {
    fun show() {
        println("Awesome Machine")
    }
}
fun main(args : Array<String>) {
    var lap1 = Laptop("Dell",2300)
    var lap2 = Laptop("Dell",2200)

    var lap3 = lap1.copy(price=2500)

    println(lap1.equals(lap2))
    println(lap3)
}
