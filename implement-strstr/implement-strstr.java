class Solution {
    public int strStr(String haystack, String needle) {
        int l1 = haystack.length();
        int l2= needle.length();
        if(l1 < l2) return -1;
        for(int i = 0; i < l1; i++){
            if(haystack.charAt(i) != needle.charAt(0))
            {}
            else{
                int j = 0;
                for(j = 1; j < l2; j++){
                    if(j + i >= l1 || haystack.charAt(i + j) != needle.charAt(j)) 
                        break;
                }if(j == l2 )
                    return i;
            }
        }
        return -1;
    }
}