class Solution {
    fun isPalindrome(x: Int): Boolean {
        var flag : Boolean = true
        val y : String = x.toString()
        val len : Int = y.length-1

        for(i in 0..len/2) {
            if(isZero(len-i) || isEqual(y[i], y[len-i])) continue
            flag = false
        }
        return flag
    }

    fun isEqual(a : Char, b : Char) : Boolean {
        return a == b
    }

    fun isZero(x : Int) : Boolean{
        return x < 0
    }
}