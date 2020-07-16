//https://leetcode.com/problems/xor-operation-in-an-array/
class XorOperation {
    fun solution(n: Int, start: Int): Int {
        var xorValue = 0
        for(i in 0 until n){
            xorValue = xorValue.xor(start.plus((2.times(i))))
        }
        return xorValue
    }
}

fun main() {
    val n = 1
    val start = 7
    println("Output is: ${XorOperation().solution(n,start)}")
}
