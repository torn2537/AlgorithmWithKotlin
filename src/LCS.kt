import kotlin.math.max

class LCS {
    fun solution(str1: String, str2: String, m: Int, n: Int) {

        var lcsTable: Array<IntArray> = Array(m + 1) { IntArray(n + 1) }
        for (i in 0..m) {
            for (j in 0..n) {
                if (i == 0 || j == 0) {
                    lcsTable[i][j] == 0
                } else if (str1[i - 1] == str2[j - 1]) {
                    lcsTable[i][j] = lcsTable[i - 1][j - 1] + 1
                } else {
                    lcsTable[i][j] = max(lcsTable[i - 1][j], lcsTable[i][j - 1])
                }
            }
        }
        var index: Int = lcsTable[m][n]
        var temp: Int = index
        var lcs = CharArray(index + 1)

        var i: Int = m
        var j: Int = n
        while (i > 0 && j > 0) {
            if (str1[i - 1] == str2[j - 1]) {
                lcs[index - 1] = str1[i - 1]
                i--
                j--
                index--
            } else if (lcsTable[i - 1][j] > lcsTable[i][j - 1]) {
                i--
            } else {
                j--
            }
        }
        // Printing the sub sequences
        print("str1: $str1 \nstr2: $str2\nLongest Common Subsequence(s) is: ")
        for (j in 0..temp) {
            print(lcs[j])
        }
        println("")
    }
}

fun main() {
    val str1 = "ACADB"
    val str2 = "CBDA"
    val m = str1.length
    val n = str2.length
    LCS().solution(str1, str2, m, n)
}
