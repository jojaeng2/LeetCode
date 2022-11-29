class Solution {
    fun smallestEvenMultiple(n: Int): Int {
        if (isEven(n)) return n
        return n * 2
    }
    
    fun isEven(n : Int) : Boolean = (n % 2 == 0)
}