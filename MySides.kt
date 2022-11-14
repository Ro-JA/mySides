fun main() {
    val mySides = Sides();
    println(mySides.sides);
    mySides.roll();
}

class Sides() {
    var sides = 6;
    fun roll() {
        val numberRandom = (1..6).random();
        prinrln(numberRandom);
    }
}