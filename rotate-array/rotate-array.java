import java.util.*;

class Solution {
    public void rotate(int[] nums, int k) {
        if(k == 0 || k == nums.length) return;
        k = k%nums.length;
        int[] same= new int[nums.length];
        for(int i = 0; i < nums.length; i++)
            same[i] = nums[i];
        int lastleng = nums.length - k;
        int i = 0;
        while(lastleng < nums.length){
            nums[i] = same[lastleng];
            i++;
            lastleng++;
        }
        int s = 0;
        while(i < nums.length){
            nums[i] = same[s];
            i++;
            s++;
        }
    }
}