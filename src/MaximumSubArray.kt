class MaximumSubArray {
    fun maxSumSubArray(arr: Array<Int>, low: Int, high: Int): Int {
        if (high == low) {
            return arr[high]
        }
        val mid: Int = low + (high - low) / 2
        val maximumSubLeftArray: Int = maxSumSubArray(arr, low, mid)
        val maximumSubRightArray: Int = maxSumSubArray(arr, mid + 1, high)
        val maximumCrossingSubArray: Int = maxCrossingSubArray(arr, low, mid, high)

        return findMaximum(maximumSubLeftArray, maximumSubRightArray, maximumCrossingSubArray)
    }

    fun maxCrossingSubArray(arr: Array<Int>, low: Int, mid: Int, high: Int): Int {
        var leftSum: Int = Int.MIN_VALUE
        var rightSum: Int = Int.MIN_VALUE
        /*'''
            iterating from middle
            element to the lowest element
            to find the maximum sum of the left
            subarray containing the middle
            element also.
  '     */
        var i: Int = mid
        var sum: Int = 0
        while (i >= low) {
            sum += arr[i]
            if (sum > leftSum) {
                leftSum = sum
            }
            i--
        }
        /*
        Similarly, finding the maximum
        sum of right subarray containing
        the adjacent right element to the
        middle element.
        */
        sum = 0
        i = mid + 1
        while (i <= high) {
            sum += arr[i]
            if (sum > rightSum) {
                rightSum = sum
            }
            i++
        }
        return (leftSum + rightSum)
    }
}

fun findMaximum(num1: Int, num2: Int, num3: Int): Int {
    return if (num1 > num2 && num1 > num3) {
        num1
    } else if (num2 > num1 && num2 > num3) {
        num2
    } else {
        num3
    }
}

fun main() {
    val arr: Array<Int> = arrayOf(3, -1, -1, 10, -3, -2, 4)
    val result: Int = MaximumSubArray().maxSumSubArray(arr, 0, arr.size - 1)
    println("Maximum sub array is: $result")
}
