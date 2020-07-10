//https://leetcode.com/problems/reverse-string/
class ReverseString {
    fun solution(s: CharArray) {
        val mid: Int = 0 + (s.size - 0) / 2
        println("Mid: $mid")
        for (i in 0 until mid) {
            val temp = s[i]
            s[i] = s[s.size - 1 - i]
            s[s.size - 1 - i] = temp
        }
        print(s.contentToString())
    }
}

fun main() {
    val s: CharArray = "hell".toCharArray()
    ReverseString().solution(s)
}
