class Solution {
    public int mySqrt(int x) {
        int start = 1, end = x;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (mid <= x / mid && (mid + 1) > x / (mid + 1)) 
                return mid;
            else if (mid > x / mid) 
                end = mid - 1;
            else 
                start = mid + 1;
        }
        return 0;
    }
}
/*
8 -> 1, 8
mid = 4;
mid^2 = 16
1,3
mid = 2


16 1,16
mid = 8
end = 7


4   1,4
mid = 2
*/