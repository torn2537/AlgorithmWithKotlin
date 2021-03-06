//https://leetcode.com/problems/reverse-linked-list/
class ListNode(var `val`: Int) {
    var next: ListNode? = null

    constructor(`val`: Int, listNode: ListNode?) : this(`val`) {
        this.next = listNode
    }
//    override fun toString(): String {
//        var copyList: ListNode? = this
//        val stringList: MutableList<Int?> = mutableListOf()
//        while (copyList !== null){
//            stringList.add(copyList.`val`)
//            copyList = copyList.next
//        }
//        return  stringList.toString()
//    }
}

class ReversedLinkedList {
    fun solution(head: ListNode?): ListNode? {
        var head: ListNode? = head ?: return null
        var prev: ListNode? = null
        var curr: ListNode? = head
        var next: ListNode?
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

    println("Result of reversing a List Node is ${ReversedLinkedList().solution(starterNode)?.`val`}")
}
