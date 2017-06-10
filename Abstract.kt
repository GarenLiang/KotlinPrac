import java.math.BigInteger
import java.util.*

abstract class Human {
    abstract fun think()

    fun talk() {
        println("talking...")
    }
}
class Doctor : Human() {
    override fun think() {
        println("Critical Thinking")
    }
}
class Alien : Human() {

    override fun think() {
        println("Virtual Thinking")
    }
}

fun main(args : Array<String>) {
    var mayank = Alien()
    mayank.talk()
    mayank.think()
}
