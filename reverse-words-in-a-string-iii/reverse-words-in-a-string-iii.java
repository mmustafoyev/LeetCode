class Solution {
    public String reverseWords(String s) {
        s.trim();
        String[] strings = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length; i++){
            StringBuilder temp = new StringBuilder(strings[i]);
            sb.append(temp.reverse());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}