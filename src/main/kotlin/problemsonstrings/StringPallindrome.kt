package problemsonstrings

object StringPallindrome {
    fun isPallindrome(str: String): Boolean {
        var i = 0
        var j = str.length - 1
        while (i <= str.length / 2) {
            if (str[i] != str[j]) {
                return false
            }
            i++
            j--
        }
        return true
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(isPallindrome("geeks"))
    }
}


object StringPallindrome2 {

    fun isPallindrome(str: String): Boolean {
        var i = 0;
        var j = str.length - 1;
        while (i <= str.length / 2) {
            if (str[i] != str[j]) return false
            i++
            j--
        }
        return true
    }


    @JvmStatic
    fun main(args: Array<String>) {
        println(isPallindrome("aka"))
    }
}
