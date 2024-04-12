class Solution {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;
        int mid  = 0;

        //4 5 6 7 8 8 8 1 2 2  3
        //4 5 6 7 0 1 2  3
        //1 3 3
        //[4,4,4,4,0,1,4]
        while(start < end){
            mid = (start + end) / 2;
            if(nums[end] < nums[mid])
                start = mid + 1;//6 7
            else if(nums[end] > nums[mid])
                end = mid;//8 7
            else
                end--;
        }
        
        return nums[end];
    }
}