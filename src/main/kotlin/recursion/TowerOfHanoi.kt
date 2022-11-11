package recursion

class TowerOfHanoi {
    companion object {
        var count: Long = 0
        fun toh(numberOfDisks: Int, tower1: Int, tower2: Int, tower3: Int): Long {
            if (numberOfDisks >= 1) {
                toh(numberOfDisks - 1, tower1, tower3, tower2)
                count++
                println("Move disk $numberOfDisks from $tower1 to $tower2")
                toh(numberOfDisks - 1, tower1, tower3, tower2)
            }
            return count
        }
    }
}

fun main() {
    println(TowerOfHanoi.toh(3, 1, 2, 3))
}