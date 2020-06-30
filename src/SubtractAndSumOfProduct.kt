//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
class SubtractAndSumOfProduct {
    fun solution(num: Int): Int {
        val numListString = num.toString().map { it.toString().toInt() }
        var multiplicationResult = 1
        var additionResult = 0
        for (i in numListString.indices) {
            multiplicationResult *= numListString[i]
            additionResult += numListString[i]
        }
        return multiplicationResult - additionResult
    }
}

fun main() {
    val input1 = 234
    val input2 = 114
    println("Result of input1: ${SubtractAndSumOfProduct().solution(input1)}")
    println("Result of input2: ${SubtractAndSumOfProduct().solution(input2)}")
}