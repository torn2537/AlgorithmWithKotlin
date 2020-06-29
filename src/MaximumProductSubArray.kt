import kotlin.math.max
import kotlin.math.min

//https://leetcode.com/problems/maximum-product-subarray/
class MaximumProductSubArray {
    fun solution(nums: IntArray): Int {
        if (nums.isEmpty()) {
            return 0
        }
        if (nums.size == 1) {
            return nums[0]
        }
        var maximumNumber = 0
        for (i in 1 until nums.size) {
            var sumProduct = nums[i] * nums[i-1]
            if(sumProduct > maximumNumber){
                maximumNumber = sumProduct
            }
        }
        return maximumNumber
    }
    fun solution2(nums: IntArray) : Int{
        if (nums.isEmpty()) {
            return 0
        }
        if (nums.size == 1) {
            return nums[0]
        }
        var maxVal: Int = nums[0]
        var minVal: Int = nums[0]
        var result: Int = nums[0]

        for(i in 1 until nums.size){
            val previousMax: Int = maxVal
            maxVal = max(max(maxVal * nums[i], minVal * nums[i]), nums[i])
            minVal = min(min(previousMax * nums[i], minVal * nums[i]), nums[i])
            if(maxVal > result){
                result = maxVal
            }
        }
        return result
    }
}

fun main() {
    val nums: IntArray = intArrayOf(2, 3, -2, 4,7)
    val nums2: IntArray = intArrayOf(0,2)
   // println("Result from 1st test case: ${MaximumProductSubArray().solution2(nums)}")
    println("Result from 2sd test case: ${MaximumProductSubArray().solution2(nums2)}")
}

