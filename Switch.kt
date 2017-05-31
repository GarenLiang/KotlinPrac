fun main(args : Array<String>) {
//    var str : String? = null
//
//    var tittu : Alien? = Alien()
//
//    tittu = null
//
//    println(tittu?.name)
    val num : Int = 2

    var str = when(num) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        else -> "Give a proper input"
    }
    println("Str is $str")
}
