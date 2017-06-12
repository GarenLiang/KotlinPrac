import java.math.BigInteger
import java.util.*

class A {
    companion object {

        fun create() : A = A()
    }
    fun show() {
        print("in show")
    }
}
fun main(args : Array<String>) {
    var obj = A.create()
    obj.show()
}
