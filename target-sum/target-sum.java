class Solution {
    public int count = 0;
    public int findTargetSumWays(int[] nums, int target) {
        dfs(nums, target, 0, 0);
        return count;
    }
    
    
    public void dfs(int[] nums, int target, int currentSum, int currentIndex){
        if(currentIndex == nums.length){
            if(currentSum == target){
                count++;
            }
            return;
        }
        
        dfs(nums, target, currentSum + nums[currentIndex], currentIndex + 1);
        dfs(nums, target, currentSum - nums[currentIndex], currentIndex + 1);
    }
}