package recursion

class JosephusProblemUsingList {

    companion object {
        fun findJosephus(num: Int, k: Int): Int {
            val listOfNumbersFrom1ToN = ArrayList<Int>()
            for (element in 1..num) {
                listOfNumbersFrom1ToN.add(element)
            }
            //for (element in listOfNumbersFrom1ToN) println(element)
            return findWinner(listOfNumbersFrom1ToN, 0, k)
        }

        private fun findWinner(
            list: ArrayList<Int>,
            indexHead: Int,
            numberOfPersonsAfterWhichOneWillBeExecuted: Int
        ): Int {

            var indexHead = indexHead

            if (list.size == 1) return list[0]

            indexHead = (indexHead + numberOfPersonsAfterWhichOneWillBeExecuted - 1) % list.size

            list.removeAt(indexHead)

            return findWinner(list, indexHead, numberOfPersonsAfterWhichOneWillBeExecuted)

        }

    }


}

fun main() {

    println(
        JosephusProblemUsingList.findJosephus(7, 3)
    )
}