package recursion

class FactorialUsingTailRecursion {
    companion object {
        fun findFactorialUsingTailRecursion(num: Int, secondFactorial: Int = 1): Int {
            return if (num == 0) secondFactorial;
            else findFactorialUsingTailRecursion(num - 1, num * secondFactorial)
        }
    }
}

fun main() {
    println(FactorialUsingTailRecursion.findFactorialUsingTailRecursion(5))
}