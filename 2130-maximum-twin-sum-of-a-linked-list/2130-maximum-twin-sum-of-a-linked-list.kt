/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
import kotlin.math.max

class Solution {
    fun pairSum(head: ListNode?): Int {
        
        var list1 = getList(head)
        var current = reverse(head)
        var list2 = getList(current)
        
        var answer : Int = 0
        for(i in 0..list1.size-1) {
            answer = max((getValue(list1, i) + getValue(list2, i)), answer)
        }
        return answer
    }
    
    fun reverse(head : ListNode?) : ListNode? {
        var prev : ListNode? = null
        var current : ListNode? = head
        var next : ListNode? = null
        
        while(isNotNull(current)) {
            next = current?.next
            current?.next = prev
            prev = current
            current = next
        }
        return prev
    }
    
    fun isNotNull(node : ListNode?) : Boolean = (node != null)
    
    fun getList(head : ListNode?) : MutableList<Int?> {
        var list : MutableList<Int?> = mutableListOf()
        var node : ListNode? = head
        while(isNotNull(node)) {
            list.add(node?.`val`)
            node = node?.next
        }
        return list
    }
    
    fun getValue(list : MutableList<Int?>, index : Int) : Int {
        return list[index] ?: 0
    }
}