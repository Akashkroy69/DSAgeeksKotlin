package recursion

class PrintFrom1ToN {
    //methods inside companion object is equivalent to static functions of Java.
    companion object {
        fun printFrom1ToN(num: Int): Unit {
            if (num != 1) printFrom1ToN(num - 1)
            println(num)
        }
    }
}

fun main() {
    PrintFrom1ToN.printFrom1ToN(5)
}