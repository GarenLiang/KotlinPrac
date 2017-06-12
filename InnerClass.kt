import java.math.BigInteger
import java.util.*

interface Human {
    fun think()
}
fun main(args : Array<String>) {
    var programmer : Human = object : Human {
        override fun think() {
            println("Think Virtually...")
        }
    }
    programmer.think()
}
