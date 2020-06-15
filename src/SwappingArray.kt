fun main() {
    val n: Int
    val x: IntArray = intArrayOf(1,2,3,4,4,3,2,1)
    shuffle2(x, x.size / 2)

}

fun shuffle(nums: IntArray, n: Int) : IntArray{
    val firstArr: IntArray = IntArray(n) { i -> nums[i]}
    val secondArr: IntArray = IntArray(n) { j -> nums[j+n]}
    val resultArr: IntArray = IntArray(2.times(n))
    var counter: Int = 0
    for(i in 0 until 2.times(n) step 2){
        resultArr[i] = firstArr[counter]
        resultArr[i+1] = secondArr[counter]
        counter += 1
    }
    println("First Array: ${firstArr.toList()} \nSecond Array:: ${secondArr.toList()}")
    print("Result Array: ${resultArr.toList()}")
    return resultArr
}

fun shuffle2(nums: IntArray, n: Int) : IntArray{
    val res: IntArray = IntArray(2.times(n))
    for(i in res.indices){
        if(i % 2 == 0) res[i] = nums[i/2]
        else res[i] =  nums[n+i/2]
    }
    println("Original Array: ${nums.toList()}")
    println("Result Array: ${res.toList()}")
    return  res
}


