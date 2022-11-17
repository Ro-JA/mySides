fun main() {
    val myFirstSides = Sides(6);
    val rollResult = myFirstSides.roll();
    val luckyNum = 4;

    when (rollResult) {
        luckyNum -> println("'You win!");
        1 -> println("So sorry! You rolled a 1. Try again!");
        2 -> println("Sadly! You rolled a 2. Try again!");
        3 -> println("Unfortunately, you rolled 3! Try again!");
        5 -> println("Don't cru! You rolled 5. Try again!");
        6 -> println("Apologies! You rolled 6. Try again!");
    }
}

class Sides(val numSides: Int) {
    fun roll() = (1..numSides).random();
}
