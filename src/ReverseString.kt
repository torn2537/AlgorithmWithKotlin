 //https://leetcode.com/problems/reverse-string/
class ReverseString {
    fun solution(s: CharArray) {
        val mid: Int = s.size / 2
        for (i in 0 until mid) {
            val temp = s[i]
            s[i] = s[s.size - 1 - i]
            s[s.size - 1 - i] = temp
        }
        print(s.asList())
    }
}

fun main() {
    val s: CharArray = "hello".toCharArray()
    ReverseString().solution(s)
}
