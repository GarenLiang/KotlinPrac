import java.util.*
/**
 * Created by garenliang on 2017/5/26.
 */


fun main(args : Array<String>) {
    var finalAmt = calcAmount(interest = 0.03,amt = 50)
    println(finalAmt)
}
@JvmOverloads
fun calcAmount(amt : Int, interest : Double = 0.04) : Int{
    return (amt + amt*interest).toInt();
}
//Runner.java
/*public class Runner {
    public static void main(String[] args) {
        System.out.println(FirstCodeKt.calcAmount(70,0.1));
    }

}
*/
