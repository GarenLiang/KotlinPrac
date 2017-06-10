import java.math.BigInteger
import java.util.*
/**
 * Created by garenliang on 2017/5/26.
 */


open class Human(age : Int) {
    init {
        println("in human" + age)
    }
    open fun think() {
        println("Real Thinking")
    }
}
class Alien(age:Int) : Human(age) {
    init {
        println("in alien")
    }
    override fun think() {
        println("Virtual Thinking")
    }
}

fun main(args : Array<String>) {
    var mayank = Alien(20)
    //mayank.think()
}
