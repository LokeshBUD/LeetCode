import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i<=nums.length-1; i++){
            int value = Math.abs(nums[i]);
            nums[i] = (int) Math.pow(value, 2);
        }
        Arrays.sort(nums);
        return nums;
    }
}