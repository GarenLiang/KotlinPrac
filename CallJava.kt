@file:JvmName("First")

import java.util.*
/**
 * Created by garenliang on 2017/5/26.
 */


fun main(args : Array<String>) {
    var result = max(8,65)

    println(result)
}
fun add(a : Int,b : Int) : Int = a+b

fun max(a : Int,b : Int) : Int = if(a>b) a else b
//Runner.java file
/*public class Runner {
    public static  void main(String[] args) {
        int result = First.add(5,8);
        System.out.println(result);
    }
}*/
