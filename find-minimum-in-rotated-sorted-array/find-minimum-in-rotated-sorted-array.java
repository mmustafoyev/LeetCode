class Solution {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;
        int mid = 0;
        if(nums[start] < nums[end])
            return nums[start];
        while(start < end){
            mid = (start + end)/2;
            if(nums[mid] > nums[end])
                start = mid + 1;
            else
                end = mid;
            
        }
        //4 5 6 7 8 1 2  3
        //4 5 6 7 0 1 2  3
        //4 5 6 7 8 9 10 0 1 2 3
        //11,13,15,17
        //[4,5,6,7,0,1,2]
        return nums[start];
    }
}