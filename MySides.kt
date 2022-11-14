fun main() {
    val myFirstSides = Sides(6, "red");
    println("Your ${myFirstSides.numSides} sides dice ${myFirstSides.colorSides} color rolled ${myFirstSides.roll()}!");
    val mySecondSides = Sides(20, "green");
    println("Your ${mySecondSides.numSides} sides dice ${mySecondSides.colorSides} color rolled ${mySecondSides.roll()}!");

}

class Sides(val numSides: Int, val colorSides: String) {
    fun roll() = (1..numSides).random();
}
