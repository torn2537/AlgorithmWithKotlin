import java.util.*
import java.util.LinkedList

//https://leetcode.com/problems/permutations/

class Permutations {
    fun permute(nums: IntArray): List<List<Int>> {
        val result: MutableList<List<Int>> = mutableListOf()
        val permutations: Queue<List<Int>> = LinkedList(mutableListOf())
        nums.forEach {
            val n: Int = permutations.size
            for (i in 0 until n) {
                val oldPermutation: List<Int> = permutations.poll()
                for (j in 0..oldPermutation.size) {
                    val newPermutation: MutableList<Int> = mutableListOf()
                    newPermutation.add(j, it)
                    if (newPermutation.size == nums.size) {
                        result.add(newPermutation)
                    } else {
                       permutations.offer(newPermutation)
                    }
                }
            }
        }
        return result
    }
}

fun main() {
    val input1: IntArray = intArrayOf(1, 2, 3)
    val result: List<List<Int>> = Permutations().permute(input1)
    println("Input is: ${input1.asList()}")
    println("Permutation result of the input is: $result")
}