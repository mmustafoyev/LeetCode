import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String verysmall =strs[0];
        for(String s : strs){
            if(verysmall.length() > s.length())
                verysmall = s;
            if(s.length() == 0)
                return "";
        }
        String s;
        for(int i = 0; i < strs.length; i++){
            for(int j = 1; j <= verysmall.length(); j++){
                if(!(verysmall.substring(0,j)).equals((strs[i].substring(0,j))))
                    verysmall = verysmall.substring(0,j - 1);
            }
        }
       
        return verysmall;
    }
}