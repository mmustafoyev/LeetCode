class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, counter = 0;
        for(int num : nums){
            if(num == 1) counter++;
            else{
                max = max < counter? counter : max;
                counter = 0;
            }
        }
        max = max < counter? counter : max;
        return max;
    }
}