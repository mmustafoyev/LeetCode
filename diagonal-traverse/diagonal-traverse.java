class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] result = new int[n*m];
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int k = 0;
        temp.add(mat[0][0]);
        for(int d = 0;d < m + n - 1; d++){
            temp.clear();
            int r = d < n ? d : n - 1;
            int c = d < n ? 0 : d - n + 1;
            while(r >= 0 && c < m){
                temp.add(mat[r][c]);
                r--;
                c++;
            }
            if(d % 2 != 0)
                Collections.reverse(temp);
            for(int item: temp){
                result[k++] = item;
            }
        }
        return result;
                
        }
    }
