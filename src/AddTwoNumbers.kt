class AddTwoNumbers {
    fun solution(l1: ListNode?, l2: ListNode?): ListNode? {
        var dummyHead: ListNode? = ListNode(0)
        return null
    }

    private fun reverse(list: ListNode?): ListNode?{
        var current: ListNode? = list
        var prev: ListNode? = null
        var next: ListNode?
        while (current !== null){
            next = current.next
            current.next = prev
            prev = current
            current = next
        }
        return prev
    }
}
fun main() {
    val l1: ListNode? = ListNode(2)
    val l2: ListNode? = ListNode(4, l1)
    val l3: ListNode? = ListNode(3, l2)

    val l4: ListNode? = ListNode(5)
    val l5: ListNode? = ListNode(6, l4)
    val l6: ListNode? = ListNode(4, l5)

    var a: ListNode? = ListNode(1)
    a = ListNode(8, a)
    val b: ListNode? = ListNode(0)
    println("The input 1 is: $l3")
    println("The input 2 is: $l6")
    println("The output of this solution is: ${AddTwoNumbers().solution(a, b)}")
    //println("The output of this solution is: ${AddTwoNumbers().solution(l3, l6)}")
}
