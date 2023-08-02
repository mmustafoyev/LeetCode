class Solution {
    public String addBinary(String a, String b) {
        int la = a.length() - 1;
        int lb = b.length() - 1;
        int a1 = 0, b1 = 0;
        StringBuilder res = new StringBuilder();
        a1 += b1;
        int count = 0;
        while (la >= 0 || lb >= 0) {
            if (la >= 0 && lb >= 0) {
                int temp = a.charAt(la) + b.charAt(lb) - 96 + count;
                count = temp / 2;
                int reminder = temp % 2;
                res.append("" + reminder);
                la--;
                lb--;
            } else if (la < 0 && lb < 0) {
                break;
            } else if (la < 0) {
                int temp = b.charAt(lb) - 48 + count;
                count = temp / 2;
                int reminder = temp % 2;
                res.append("" + reminder);
                lb--;
            } else if (lb < 0) {
                int temp = a.charAt(la) - 48 + count;
                count = temp / 2;
                int reminder = temp % 2;
                res.append("" + reminder);
                la--;
            }

        }
        if(count == 1) res.append("1");
        return res.reverse().toString();
    }
}//11111001