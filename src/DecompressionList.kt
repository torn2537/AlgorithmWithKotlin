//https://leetcode.com/problems/decompress-run-length-encoded-list/
class DecompressionList {
    fun solution(nums: IntArray): IntArray {
        val resultIntList: MutableList<Int> = mutableListOf()
        var i = 0
        while (i < nums.size - 1) {
            if (i % 2 == 0) {
                val freq: Int = nums[i]
                val value: Int = nums[i + 1]
                for (j in 0 until freq) {
                    resultIntList.add(value)
                }
            }
            i++
        }
        return resultIntList.toIntArray()
    }
}

fun main() {
    val testInput: IntArray = intArrayOf(1, 2, 3, 4)
    val testInput2: IntArray = intArrayOf(1, 1, 2, 3)
    println("Result of decompression testInput is: ${DecompressionList().solution(testInput).asList()}")
    println("Result of decompression testInput2 is: ${DecompressionList().solution(testInput2).asList()}")
}
