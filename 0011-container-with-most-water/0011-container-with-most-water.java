class Solution {
    public int maxArea(int[] height) {
        int answer = -1;
        int left = 0;
        int right = height.length-1;
        while (left < right) {
            answer = Math.max(answer, (right-left) * Math.min(height[left], height[right]));
            if (height[left] < height[right]) left++;
            else right--;
        }
        return answer;
    }
}