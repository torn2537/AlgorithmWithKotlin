class SumArray {
    fun runningSum(nums: IntArray): IntArray {
        //runningSum[i] = sum(nums[0]…nums[i])
        if (nums.size == 1) {
            return nums
        }
        var accumulateVar = 0
        val resultArr = IntArray(nums.size)
        for(i in nums.indices){
            accumulateVar += nums[i]
            resultArr[i] = accumulateVar
        }
        return resultArr
    }
    fun runningSum2(nums: IntArray): IntArray {
        var i = 1
        while (i < nums.size){
            nums[i] += nums[i-1]
            i++
        }
        return nums
    }
}

fun main() {
    val input: IntArray = intArrayOf(1, 2, 3, 4)
    val sumArray = SumArray()
    println("Input: ${input.toList()}")
    println("Result: ${sumArray.runningSum2(input).toList()}")
}
