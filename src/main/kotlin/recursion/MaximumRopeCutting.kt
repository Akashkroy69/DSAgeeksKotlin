package recursion

/**
 * source: question and explanation is in the video course taken from Geeksforgeeks.
 * <p>
 * Maximum Product Cutting
 * QUESTION:
 * Given a rope of length n.
 * max num of pieces you can make such that length of every piece is in
 * set {a,b,c} for the given values a,b,c
 * <p>
 * ex:1
 * I/p: 23, a = 12, b = 9, c = 11
 * o/p: 2
 * <p>
 * ex:2
 * i/p: 5, a,b,c: 2,5,1
 * o/p: 5
 * <p>
 * i/p: n=5, a,b,c: 4,2,6
 * o/p: -1
 */
class MaximumRopeCutting {
    companion object {
        fun findMaximumRopeCutting(ropeLength: Int, a: Int, b: Int, c: Int): Int {
            if (ropeLength == 0) return 0
            if (ropeLength < 0) return -1
            val maxNumberOfRopeCuts = Math.max(
                Math.max(
                    findMaximumRopeCutting(ropeLength - a, a, b, c),
                    findMaximumRopeCutting(ropeLength - b, a, b, c)
                ), findMaximumRopeCutting(ropeLength - c, a, b, c)
            )
            return if (maxNumberOfRopeCuts == -1) -1 else maxNumberOfRopeCuts + 1
        }
    }
}

fun main() {
    println(MaximumRopeCutting.findMaximumRopeCutting(23, 12, 9, 11))
    println(MaximumRopeCutting.findMaximumRopeCutting(5, 2, 5, 1))
    println(MaximumRopeCutting.findMaximumRopeCutting(5, 4, 2, 6))
}