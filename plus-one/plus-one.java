class Solution {
    public int[] plusOne(int[] digits) {
        int temp = 1;
        boolean exist = false;
        for(int i = digits.length -1;i >= 0; i--){
            if(digits[i] + temp < 10){
                digits[i] = digits[i] + temp;
                temp = 0;
                return digits;
            }
            if(i == 0){
                int[] ar = new int[digits.length +1];
                ar[0] = 1;
                return ar;
            }
            digits[i] = (digits[i] + temp) % 10;
        }
        return digits;
    }
}