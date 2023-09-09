import java.util.*;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {//81 85 81
        int len = temperatures.length;
        int[] answers = new int[len];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < len; i++){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int index = stack.pop();
                answers[index] = i - index;
            }
            stack.push(i);
        }
    
        return answers;
    }
}