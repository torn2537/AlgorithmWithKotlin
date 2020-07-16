//https://leetcode.com/problems/majority-element-ii/
class MajorElement2 {
    fun solution(nums: IntArray): List<Int> {
        if (nums.isEmpty()) {
            return listOf()
        } else if (nums.size == 1) {
            return listOf(nums[0])
        }
        val majorElementCriteria: Int = nums.size / 3
        val mapAllResult = mutableMapOf<Int, Int>()
        for (num in nums) {
            if (mapAllResult.containsKey(num)) {
                mapAllResult[num] = mapAllResult.getValue(num) + 1
            } else {
                mapAllResult[num] = 1
            }
        }
        return mapAllResult
            .filterValues { it > majorElementCriteria }
            .map { it.key }
    }
}

fun main() {
    val nums: IntArray = intArrayOf(1, 1, 1, 3, 3, 2, 2, 2)
    println("The input is ${nums.asList()}")
    println("The result of the MajorityElement problem II is: ${MajorElement2().solution(nums)}")
}
