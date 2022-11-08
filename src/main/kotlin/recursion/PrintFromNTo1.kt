package recursion

class PrintFromNTo1 {

    companion object {
        fun printFromNto1(num: Int): Unit {

            return if (num == 0) {

            } else {
                println(num)
                printFromNto1(num - 1)
            }
        }
    }


}

fun main() {
    PrintFromNTo1.printFromNto1(5)
}