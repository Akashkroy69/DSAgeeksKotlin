package recursion

class FactorialUsingRec {

}

fun printFactorialOfNum(num: Int): Int {
    return if (num == 1) 1;
    else {
        num * printFactorialOfNum(num - 1)
    }
}

fun main() {
    println(printFactorialOfNum(5))
}