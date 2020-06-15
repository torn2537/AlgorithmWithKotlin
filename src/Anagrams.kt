//https://leetcode.com/problems/find-all-anagrams-in-a-string/
class Anagrams(val s: String, val p: String) {
    fun solution() {
        val resultLs: MutableList<Int> = mutableListOf()
        val arrP: CharArray = p.toCharArray()
        val arrS: CharArray = s.toCharArray()

        for (p in arrP) {
            for (s in arrS) {
               if(p == s){

               }
            }

        }
        println("Result output: $resultLs")
    }
}

fun main() {
    val s = "cbaebabacd"
    val p = "abc"
    println("Original Input s: $s and p: $p")
    val anagramsObj = Anagrams(s, p)
    anagramsObj.solution()
}
