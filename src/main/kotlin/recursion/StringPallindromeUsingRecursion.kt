package recursion

class StringPallindromeUsingRecursion {
    companion object {
        fun isPallindromeUsingRecursion(str: String): Boolean {
            val i = 0
            val j = str.length - 1
            return if (i == j || i > j) true
            else if (str[i] == str[j]) isPallindromeUsingRecursion(str.substring(i + 1, j))
            else false
        }
    }
}

fun main() {
    println(StringPallindromeUsingRecursion.isPallindromeUsingRecursion("aaba"))
}