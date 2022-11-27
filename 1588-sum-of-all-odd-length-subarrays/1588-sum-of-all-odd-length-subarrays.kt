class Solution {
    fun sumOddLengthSubarrays(arr: IntArray): Int {
        var answer : Int = 0
        for(i in 0..arr.size-1) {
            (1..arr.size)
                .filter(this::isOdd)
                .filter{j -> isLessLimited(i+j, arr.size)}
                .forEach { j ->
                    answer += sumOfArray(arr.copyOfRange(i, i+j))
            }
        }
        return answer
    }

    fun sumOfArray(arr: IntArray): Int = arr.reduce { acc, num -> acc + num }

    fun isOdd(num: Int) : Boolean = (num % 2 == 1)
    
    fun isLessLimited(index : Int, limited : Int) : Boolean {
        return index <= limited
    }
}