import java.util.*

fun main(args : Array<String>) {
    var str : String = "4a"
    var num : Int = try {
        str.toInt()
    }
    catch(e : NumberFormatException) {
        1
    }

    num++

    println(num)
}
