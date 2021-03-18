class TapeEquilibrium {
    /*
    * Example: A[0] = 3 A[1] = 1 A[2] = 2 A[3] = 4 A[4] = 3
    We can split this tape in four places:
      P = 1, difference = |3 − 10| = 7
      P = 2, difference = |4 − 9| = 5
      P = 3, difference = |6 − 7| = 1
      P = 4, difference = |10 − 3| = 7
    * */
    fun solution(a: MutableList<Int>): Int {
        var minimumSubtraction = 0
        var totalSummation  = 0
        for (num in 1 until a.size) {
            totalSummation += a[num]
        }
        print("Total summation is: $totalSummation")
        for(idx in a.indices-1){
            
        }
        return minimumSubtraction
    }
}

fun main() {
    val a = mutableListOf(3, 1, 2, 4, 3)
    TapeEquilibrium().solution(a)
}
