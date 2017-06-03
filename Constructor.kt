import java.math.BigInteger
import java.util.*

class Human (var n : String) {
    var name : String = n
    fun think() {
        println("Kotlin is Awesome... $name")
    }
}

fun main(args : Array<String>) {
    var garen = Human("Garen")
    garen.think()
}
//Second Constructor
class Human (var n : String) {
    var age : Int = 0
    var name : String = n

    constructor(age : Int,name : String) : this(name) {
        this.age = age;
    }
    fun think() {
        println("Kotlin is Awesome... $name: $age")
    }
}

fun main(args : Array<String>) {
    var garen = Human(20,"Garen")
    garen.think()
}
