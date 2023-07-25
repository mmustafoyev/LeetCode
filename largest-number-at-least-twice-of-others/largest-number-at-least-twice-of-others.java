class Solution {
    public int dominantIndex(int[] nums) {
        int result = -1;
        int first = Integer.MIN_VALUE;
        int temp1 = Integer.MIN_VALUE + 3;
        for(int i = 0; i < nums.length; i++){
            if(first < nums[i]){
                temp1 = Math.max(first,temp1);
                first = nums[i];
                result = i;
            }
            else
                temp1 = Math.max(nums[i], temp1);
            
        }
        return (first >= temp1 * 2)?result:-1;
    }
}