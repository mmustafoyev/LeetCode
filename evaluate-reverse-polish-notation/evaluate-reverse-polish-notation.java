class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length == 1)
            return Integer.parseInt(tokens[0]);
        Stack<Integer> stack = new Stack<>();
        int result = 1;
        for(String s : tokens){
            if(isNumeric(s))
                stack.push(Integer.parseInt(s));
            else{
                int num1 = stack.pop();
                int num2 = stack.pop();
                switch(s){
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num2 - num1;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        result = num2 / num1;
                        break;
                }
                stack.push(result);
            }
        }
        return result;
    }
    public boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}