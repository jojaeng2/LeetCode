/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

import kotlin.math.max

class Solution {
    fun deepestLeavesSum(root: TreeNode?): Int {
        val maxi : Int = getMaxDepth(root)
        return dfs(root, maxi, 1)
    }
    
    fun dfs(node : TreeNode?, depth : Int, curr : Int) : Int {
        if(node == null) return 0
        if (isEqual(depth, curr)) {
            return getValue(node)
        }
        return dfs(node!!.left, depth, curr+1) + dfs(node!!.right, depth, curr+1)
    }
    
    fun getMaxDepth(node : TreeNode?) : Int {   
        if(node == null) return 0
        return max(
            getMaxDepth(node!!.left) + 1, 
            getMaxDepth(node!!.right) + 1
        )
    }
    
    fun getValue(node : TreeNode) : Int = node.`val`
    
    fun isEqual(a : Int, b : Int) : Boolean = (a == b)
}