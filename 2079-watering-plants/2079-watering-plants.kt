class Solution {
    fun wateringPlants(plants: IntArray, capacity: Int): Int {
        var answer : Int = 0
        var current : Int = capacity
        for (i in plants.indices) {
            if (isPossible(plants[i], current)) {
                answer++
                current -= plants[i]
            }
            else {
                answer += 2*i+1
                current = capacity - plants[i]
            }
        }
        
        return answer
    }

    fun isPossible(a : Int, b : Int) = (a <= b)

}