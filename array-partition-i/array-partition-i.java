class Solution {
    final static int K = 10000;
    public int arrayPairSum(int[] nums) {
        int[] arr = new int[2 * K +1];
        int maxSum = 0;
        for(int element : nums){
            arr[K + element]++;
        }
        boolean isOdd = true;
        for(int i = 0; i <= 2 * K; i++){
            while(arr[i] >0){
                maxSum += isOdd? i - K: 0;
                isOdd = !isOdd;
                arr[i]--;
            }
        }
        return maxSum;
    }
}
/*Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i = 2 + i)
            sum += nums[i];
        return sum;*/