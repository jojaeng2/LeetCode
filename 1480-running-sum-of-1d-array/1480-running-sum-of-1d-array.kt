class Solution {
    fun runningSum(nums: IntArray): IntArray {
        var current : Int = 0
        var answer : MutableList<Int> = mutableListOf()
        nums.forEach {
            current += it
            answer.add(current)
        }
        return answer.toIntArray()
    }
}