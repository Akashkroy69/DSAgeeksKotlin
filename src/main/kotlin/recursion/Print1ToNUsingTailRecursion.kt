package recursion

class Print1ToNUsingTailRecursion {
    companion object {
        fun print1ToNUsingTailRecursion(lastNum: Int, startingNumber: Int = 1): Unit {

            if (lastNum >= 1)
            {
                println(startingNumber)
                print1ToNUsingTailRecursion(lastNum - 1, startingNumber + 1)
            }
        }
    }
}

fun main() {
    Print1ToNUsingTailRecursion.print1ToNUsingTailRecursion(10)
}