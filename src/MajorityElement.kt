//https://leetcode.com/problems/majority-element/
class MajorityElement {
    fun solution(nums: IntArray): Int {
        if(nums.size == 1){
            return nums[0]
        }
        val resultMap: MutableMap<String, Int> = mutableMapOf()
        for(num in nums){
            if(resultMap.containsKey(num.toString())){
                resultMap[num.toString()] = resultMap.getValue(num.toString()) + 1
            }
            else {
                resultMap[num.toString()] = 1
            }
        }
        println("The accumulate  maximum value is: ${resultMap.maxBy { it.value }?.value}")
        return resultMap.maxBy { it.value }?.key?.toInt()!!
    }

    fun solution2(nums: IntArray): Int {
        nums.sort()
        println("The sorted array is is: ${nums.asList()}")
        return nums[nums.size / 2]
    }
}

fun main() {
    val nums: IntArray = intArrayOf(2,2,1,1,1,2,2)
    println("The input is: ${nums.asList()}}")
    println("The majority element is: ${MajorityElement().solution2(nums)}")
}
