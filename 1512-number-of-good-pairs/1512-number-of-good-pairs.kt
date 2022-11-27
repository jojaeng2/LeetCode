class Solution {
    fun numIdenticalPairs(nums: IntArray): Int {
        val list = nums.groupBy { it }
            .map { it.value.size }
        return list.fold(0) {
                total, num -> total + num * (num-1) / 2
            }
    }
}