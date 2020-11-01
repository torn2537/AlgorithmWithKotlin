//https://leetcode.com/problems/move-zeroes/
class MoveZeroes {
    fun solution(nums: IntArray) {
        if (nums.size == 1) {
            return
        }
        var firstZeroIndices = 0
        for (i in nums.indices) {
            if (nums[i] != 0) {
                if(i > firstZeroIndices) {
                    val temp: Int = nums[firstZeroIndices]
                    nums[firstZeroIndices] = nums[i]
                    nums[i] = temp
                }
                firstZeroIndices++
            }
        }
        println("The output is: ${nums.asList()}")
    }
}

fun main() {
    val nums: IntArray = intArrayOf(1)
    println("The input is: ${nums.asList()}")
    MoveZeroes().solution(nums)
}
