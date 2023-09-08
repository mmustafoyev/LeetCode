class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new  HashMap<>(Map.of('[',']','{', '}', '(', ')'));
        Map<Character, Character> mapreverce = new  HashMap<>(Map.of(']','[', '}', '{', ')', '('));
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(map.containsKey(c)){
                stack.push(c);
            }
            else{
                if(!stack.contains(mapreverce.get(c)))
                    return false;
                else
                    if(stack.pop() != mapreverce.get(c))
                        return false;
            }
        }
        return stack.isEmpty();
    }
}