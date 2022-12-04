
class Solution {
    fun maxCoins(piles: IntArray): Int {
        var answer : Int = 0
        var left : Int = 0
        var right : Int = piles.size-1
        piles.sort()
        while (left <= right) {
            right--
            answer += piles[right--]
            left++
        }
        return answer
    }
}