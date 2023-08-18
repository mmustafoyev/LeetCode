class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
            
        }
        while(j < nums.length)nums[j++] = 0;
    }
}
//0 1 2 3 4
//0,1,0,3,12