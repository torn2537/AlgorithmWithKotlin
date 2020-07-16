//https://leetcode.com/problems/number-of-good-pairs/
class NumberOfGoodPairs {
    fun solution(nums: IntArray): Int{
        var number = 0
        for(i in nums.indices){
            for(j in nums.indices){
                if(nums[i] == nums[j] && i < j){
                    number++
                }
            }
        }
        return number
    }

    fun solution2(nums: IntArray): Int {
        var result = 0
        val collector: MutableMap<Int,Int> = HashMap()
        nums.forEach {
            collector[it] = collector.getOrDefault(it, 0) + 1
            result += collector[it]?.minus(1) ?: 0
        }
        return  result
    }
}

fun main() {
    val nums: IntArray = intArrayOf(1,2,3,1,1,3)
    println("The input is: $nums")
    println("The Number of good pair is: ${NumberOfGoodPairs().solution2(nums)}")
}
