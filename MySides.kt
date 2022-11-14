fun main() {
    val mySides = Sides();

    val diceRoll = mySides.roll();
    println("Your ${mySides.sides} sides dice rolled $diceRoll ");

}

class Sides() {
    var sides = 6;
    fun roll(): Int {
        val numberRandom = (1..6).random();
        return numberRandom;
    }
}