class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        Integer count = 0, max = 0;
        for(int num : nums){
            if(num == 1){
                count++;
                max = Math.max(count,max);
            }else{
                count = 0;
            }
        }
        return Math.max(count,max);
    }
}