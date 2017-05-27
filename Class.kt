fun main(args : Array<String>) {
    println("Hello World")

    var tittu = Alien();

    tittu.name = "Harsh";

    println("Name is : ${tittu.name}")

    tittu = Alien()

    println("Name is : ${tittu.name}")
}
//Another file Alien.kt
class Alien {
    var name : String = "";
}
