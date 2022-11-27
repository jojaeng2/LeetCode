class Solution {
    fun numIdenticalPairs(nums: IntArray): Int {
        var answer : Int = 0
        for(i in nums) {
            answer += (nums.filter { i == it }.size - 1)
        }
        return answer / 2
    }
}