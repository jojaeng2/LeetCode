

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
class Solution {
    fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
        return dfs(root, low, high)
    }

    fun dfs(node : TreeNode?, low : Int, high : Int) : Int {
        var res : Int = 0
        if (node == null) return 0
        res += dfs(node?.left, low, high)
        res += dfs(node?.right, low, high)
        if (isRanged(low, high, node?.`val`)) {
            res += node?.`val` ?: 0
        }
        return res
    }

    fun isRanged(a : Int, b : Int, c : Int?) : Boolean {
        if(c == null) return false
        return (c in a..b)
    }


}