package recursion

/**
 *
 * Given a string str, print all substrings of it. (In any order)
 *
 * ex: i/p: "ABC"
 * o/p: "", "A", "B", "C", "AB", "AC", "BC", "ABC"
 * Approach:
 *
 *
 * */
class SubStrings {
    companion object {
        fun printSubStrings(str: String?, currentString: String = "", index: Int = 0) {

            if (index == str?.length) {
                println(currentString)
                return
            }

            printSubStrings(str, currentString, index + 1)
            printSubStrings(str, currentString.plus(str?.get(index)), index + 1)
        }
    }
}

fun main() {
    SubStrings.printSubStrings("ABC")
}