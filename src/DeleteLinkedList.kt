//https://leetcode.com/problems/delete-node-in-a-linked-list/
class DeleteLinkedList {
    fun deleteNode(node: ListNode?, inputNode: ListNode?){
        val keyToDelete: Int? = node?.`val`
        var currentNode: ListNode? = inputNode
        var prevNode: ListNode? = null
        while(currentNode !== null && currentNode.`val` != keyToDelete){
            prevNode = currentNode
            currentNode = currentNode.next
        }
        if(currentNode != null){
            prevNode?.next = currentNode.next
            println("$keyToDelete is founded and deleted.")
        }
    }
}

fun main() {
    val starterListNode = ListNode(4)
    starterListNode.next = ListNode(5)
    starterListNode.next?.next = ListNode(1)
    starterListNode.next?.next?.next = ListNode(9)
    println("1st value of a list Node are: ${starterListNode.`val`}")
    println("2sd value of a list Node are: ${starterListNode.next?.`val`}")
    println("3rd value of a list Node are: ${starterListNode.next?.next?.`val`}")
    println("4th value of a list Node are: ${starterListNode.next?.next?.next?.`val`}")
    DeleteLinkedList().deleteNode(ListNode(5),starterListNode)

}
