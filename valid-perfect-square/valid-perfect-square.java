class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1) return true;
        long start = 1, end = num/2;
        long mid = 1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (mid * mid == num) 
                return true;
            else if(mid * mid < num)
                start = mid + 1;
            else 
                end = mid - 1;
        }
        return false;
    }
}