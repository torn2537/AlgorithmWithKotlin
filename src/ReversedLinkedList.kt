//https://leetcode.com/problems/reverse-linked-list/
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class ReversedLinkedList {
    fun solution(head: ListNode?): ListNode? {
        var head = head
        if (head == null) {
            return null
        }
        var prev: ListNode? = null
        var curr: ListNode? = head
        var next: ListNode? = null
        while (curr != null) {
            next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        }
        head = prev
        return head
    }
}

fun main() {
    val starterNode = ListNode(1)
    starterNode.next = ListNode(2)
    starterNode.next?.next = ListNode(3)
    starterNode.next?.next?.next = ListNode(4)
    starterNode.next?.next?.next?.next = ListNode(5)

    println("Result of reversing a List Node is ${ReversedLinkedList().solution(starterNode)?.next?.`val`}")
}