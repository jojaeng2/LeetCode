class Solution {
    fun minimumSum(num: Int): Int {
        val res = intToList(num).sorted()
        val li1 : MutableList<Int> = mutableListOf()
        val li2 : MutableList<Int> = mutableListOf()
        for(i in 0..res.size-1) {
            if (i % 2 == 0) li1.add(res[i])
            else li2.add(res[i])
        }
        var answer = 0
        answer += listSum(li1) + listSum(li2)
        return answer
    }

    fun listSum(nums : List<Int>) : Int = nums.reduce{sum, num -> sum * 10 + num}

    fun intToList(num : Int) : List<Int> {
        val li : MutableList<Int> = mutableListOf()
        var number = num
        while (number != 0) {
            li.add(number%10)
            number /= 10
        }
        return li
    }
}