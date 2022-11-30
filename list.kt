fun main() {
    val numbers: List<Int> = listOf(1,2,3,4,5,6)
    println("List:$numbers")
    println("Size list: ${numbers.size}")
//    Access elements of the list
    println("First elements: ${numbers[0]}")
    println("Second elements: ${numbers[1]}")
    println("Last index: ${numbers.size-1}")
    println("Last elements: ${numbers[numbers.size-1]}")
    println("Last: ${numbers.last()}")
    println("First: ${numbers.first()}")
//    use the contains() method
    println("Contains 4: ${numbers.contains(4)}")
    println("Contains 7: ${numbers.contains(7)}")

    val color = listOf("green", "red", "blue")
    println("Revesed list: ${color.reversed()}")
    println("List ${color}")
    println("Sorted list: ${color.sorted()}")
 }