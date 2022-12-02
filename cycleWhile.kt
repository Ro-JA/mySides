fun main() {
    val guestesPerFamily = listOf(2,4,1,3)
    var totalGuestes = 0
    var index = 0
    while(index < guestesPerFamily.size) {
        totalGuestes += guestesPerFamily[index]
        index++
    }
    println("Total Guestes Count: $totalGuestes")
}