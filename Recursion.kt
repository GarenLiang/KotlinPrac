import java.util.*

fun main(args : Array<String>) {
    var num = 5

    println(fact(num))
}

fun fact(num : Int) : Int {
    if (num == 0)
        return 1;
    else
        return num*fact(num-1)
}
//BigInteger
import java.math.BigInteger
import java.util.*
fun main(args : Array<String>) {
    var num = BigInteger("5")
    println(fact(num,BigInteger.ONE))
}

tailrec fun fact(num : BigInteger, result : BigInteger) : BigInteger {
    if (num == BigInteger.ZERO)
        return result;
    else {
        return fact(num-BigInteger.ONE,num*result)
    }
}
