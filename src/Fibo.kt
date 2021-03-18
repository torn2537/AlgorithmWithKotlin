class Fibo {
    private val caches: MutableMap<Int, Long> = HashMap()

    fun find(n: Int): Long{
        return calculateByMemoization(n)
    }

    private fun calculateByMemoization(n: Int): Long{
        if( n == 0) return 0
        if( n == 1) return 1

        return when{
            caches.containsKey(n) -> caches[n]!!
            else ->{
                caches[n] = calculateByMemoization(n - 1) + calculateByMemoization(n - 2)
                caches[n]!!
            }
        }
    }
}
fun main() {
    val n = 10
    println("The Fibonacci of $n is: ${Fibo().find(n)}")
}
