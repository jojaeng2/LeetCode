class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val answer : MutableList<Int> = mutableListOf()
        for(i in nums) {
            answer.add(i)
        }
        for(i in nums) {
            answer.add(i)
        }
        return answer.toIntArray();
    }
}