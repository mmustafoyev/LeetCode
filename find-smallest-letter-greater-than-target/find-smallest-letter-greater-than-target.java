class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length - 1;
        int mid = 0;
        boolean exist = true;
        while(start <= end){
            mid = (start + end) / 2;
            if(letters[mid] <= target){
                start = mid + 1;
            }
            else
                end = mid - 1;
        }
        if(letters[mid] <= target) mid++;
        if(mid  == letters.length) exist = false;
        return exist?letters[mid]:letters[0];   
    }
}