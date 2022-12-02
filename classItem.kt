open class Item(val name: String, val price: Int)

class Noodles : Item("Noodles", 10)

class Vegetablse : Item("Vegetablse", 5)

fun main(){
    val noodles = Noodles()
    val vegetablse = Vegetablse()
    println(noodles)
    println(vegetablse)

}