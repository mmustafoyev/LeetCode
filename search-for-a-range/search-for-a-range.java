class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        if(first == -1)
            return new int[]{-1,-1};
        int last = findLast(nums, target);
        
        return new int[]{first, last};
    }
    public int findFirst(int[] nums, int target){
        int start = 0, end = nums.length;
        int mid = 0,result = -1;
        //2,5,6,7,8,8,8,8,8,8,9  ->11 5->8
        while(start < end){
            mid = (start + end)/2;
            if(nums[mid] >= target)
                end = mid;
            else
                start = mid + 1;
            if(nums[mid] == target)
                result = mid;
        }
        
        return result;
    }
    
    public int findLast(int[] nums, int target){
        int start = 0, end = nums.length;
        int mid = 0,result = -1;
        //2,5,6,7,8,8,8,8,8,8,9  ->11 5->8
        while(start < end){
            mid = (start + end)/2;
            if(nums[mid] <= target)
                start = mid + 1;
            else
                end = mid;
            if(nums[mid] == target)
                result = mid;
        }
        
        return result;
    }
}