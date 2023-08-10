class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i < numbers.length; i++)
            numbers[i] += 1001;
        target += 2002;
        int start = 0;
        int end = numbers.length - 1;
        int temp = target;
        while(numbers[start] + numbers[end] != target){
            while(temp < numbers[end]) end--;
            temp = target - numbers[end];
            while(temp > numbers[start]) start++;
            if(numbers[start] + numbers[end] == target)
                return new int[]{start + 1, end + 1};
            temp = target - numbers[start];
        }
        return new int[]{start + 1, end + 1};
    }
}
//        return start < end ?new int[]{start + 1, end + 1}:new int[]{end + 1, start + 1};

/*



int start = 0;
        int end = numbers.length - 1;
        while(numbers[start] + numbers[end] != target){
            if(numbers[start] + numbers[end] < target)
                start++;
            else end--;
        }
        return new int[]{start + 1, end + 1};






for(int i = 0;i < numbers.length; i++)
            numbers[i] +=10001;
        target += 10001;
        int start = 0;
        int end = numbers.length - 1;
        while(target < numbers[end] && end > 1)end--;
            int temp = target - numbers[end];
            while(temp > numbers[start]) start++;
            if(numbers[start] + numbers[end] == target)
                return start < end ?new int[]{start + 1, end + 1}:new int[]{end + 1, start + 1};
                
            temp = target - numbers[start];
            while(temp < numbers[end] && end > 1)end--;
            if(numbers[start] + numbers[end] == target){
                return start < end ?new int[]{start + 1, end + 1}:new int[]{end + 1, start + 1};
            }
        
        return start < end ?new int[]{start + 1, end + 1}:new int[]{end + 1, start + 1};*/