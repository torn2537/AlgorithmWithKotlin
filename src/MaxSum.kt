import kotlin.math.max

class MaxSum {
    fun findMaxSum(arr:IntArray, low: Int , high: Int): Int{
        if(low == high){
            return arr[high]
        }
        val mid: Int = low + (high - low) / 2
        val maxLeftSumArray: Int = findMaxSum(arr,low,mid)
        val maxRightSumArray: Int = findMaxSum(arr, mid+1, high)
        val maxCrossingSumArray: Int = findMaxSumCrossingArray(arr, low, mid, high)
        return intArrayOf(maxLeftSumArray, maxRightSumArray, maxCrossingSumArray).max() ?: 0
    }
    fun findMaxSumCrossingArray(arr:IntArray, low: Int, mid: Int, high: Int): Int{
        var leftSum: Int = 0
        var rightSum: Int = 0


        //Left array
        var i: Int = mid
        var sum: Int = 0
        while(i >= low){
            sum += arr[i]
            if(sum > leftSum){
                leftSum = sum
            }
            i--
        }

        //Right array
        i = mid + 1
        sum = 0
        while(i<=high){
            sum += arr[i]
            if(sum > rightSum){
                rightSum = sum
            }
            i++
        }
        return (leftSum + rightSum)
    }

    fun solution(nums: IntArray): Int{
        if(nums.isEmpty()) return 0
        if(nums.size == 1) return nums[0]
        var sum: Int = nums[0]
        var max: Int = nums[0]

        for(i in 1 until nums.size){
            if(sum < 0){
                sum = nums[i]
            }
            else{
                sum += nums[i]
            }
            max = max(max, sum)
        }
        return max
    }
}

fun main() {
    val arr:IntArray = intArrayOf(2,1,-3,4,-1,2,1,-5,4)
    println("Result: ${MaxSum().findMaxSum(arr,0,arr.size - 1)}")
    println("Result: ${MaxSum().solution(arr)}")
}
