//https://leetcode.com/problems/single-number/
class SingleNumber {
    fun solution(nums: IntArray): Int {
        if (nums.size == 1) {
            return nums[0]
        }
        var result: Int = 0
        for(i in nums.indices){
            result = result.xor(nums[i])
        }
        return result
    }
}

fun main() {
    val nums: IntArray = intArrayOf(1,1)
    println("Single number of solution is: ${SingleNumber().solution(nums)}")
}