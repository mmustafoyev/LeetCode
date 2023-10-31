class Solution {
    int index = 0;
    public String decodeString(String s) {
        StringBuilder result = new StringBuilder();
        int num = 0;
        while (index < s.length()){
            char c = s.charAt(index);
            if(Character.isDigit(c)){
                num = num * 10 +( c - '0');
            } else if (c == '[') {
                index++;
                String nested = decodeString(s);
                for (int i = 0; i < num; i++) {
                    result.append(nested);
                }
                num = 0;
            } else if (c == ']')
                break;
            else
                result.append(c);
            index++;
        }
        return result.toString();
    }
}