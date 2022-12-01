fun main() {
    val entrees = mutableListOf<String>()
    println("Entrees: $entrees")
//    Add individual items using add
    println("Add nodles: ${entrees.add("noodles")}")
    println("Entrees: $entrees")
    println("Add spagheeti: ${entrees.add("spagheeti")}")
    println("Entrees: $entrees")
//    Add a list of items using addAll()
    val moreItems = listOf("ravioli", "lasagna", "fettuccine")
    println("Add list: ${entrees.addAll(moreItems)}")
    println("Entrees: $entrees")
//    Remove an item the using remove()
    println("Remove spagheeti: ${entrees.remove("spagheeti")}")
    println("Entrees: $entrees")
    println("Remove item then does't exist: ${entrees.remove("rice")}")
//    Remove  an item using removeAt() with an Index
    println("Remove first element: ${entrees.removeAt(0)}")
    println("Entrees: $entrees")
//    clear out the list
    entrees.clear()
    println("Entrees: $entrees")
//    Check if the list in empyte
    println("Empyte?: ${entrees.isEmpty()}")

}