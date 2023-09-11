class Solution {
    public int evalRPN(String[] tokens) {
        Set<String> set = new HashSet<>(List.of("+","-","*","/"));
        if(tokens.length == 1)
            return Integer.parseInt(tokens[0]);
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens){
            if(!set.contains(s))
                stack.push(Integer.parseInt(s));
            else{
                switch(s){
                    case "+":
                        stack.push(stack.pop() + stack.pop());
                        break;
                    case "-":
                        stack.push( - stack.pop() + stack.pop());
                        break;
                    case "*":
                        stack.push(stack.pop() * stack.pop());
                        break;
                    case "/":
                        int num = stack.pop();
                        stack.push(stack.pop() / num);
                        break;
                }
                
            }
        }
        return stack.pop();
    }
/*    public boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }*/
}