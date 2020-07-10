import java.util.*
import java.util.LinkedList

//https://leetcode.com/problems/permutations/

class Permutations {
    fun  <T> permute(nums: List<T>): List<List<T>> {
        if(nums.size == 1) return listOf(nums)
        val perms: MutableList<List<T>> = mutableListOf()
        val toInsert: T = nums[0]
        for(perm in permute(nums.drop(1))){
            for(i in 0..perm.size){
                val newPerm = perm.toMutableList()
                newPerm.add(i, toInsert)
                perms.add(newPerm)
            }
        }
        return perms
    }
}

fun main() {
    val input = listOf('a', 'b')
    val perms = Permutations().permute(input)
    println("There are ${perms.size} permutations of $input, namely:\n")
    for (perm in perms) println(perm)
}
