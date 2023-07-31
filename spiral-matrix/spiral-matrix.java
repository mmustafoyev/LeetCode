import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        int[][] rotate = {{0,1},{1,0},{0,-1},{-1,0}};
        int n = matrix.length;
        int m = matrix[0].length;
        boolean[][] full = new boolean[n][m];
        int i = 0,j = 0;
        result.add(matrix[0][0]);
        full[0][0] = true;
        while(result.size() != n * m){
            for(int k = 0; k < 4; k++){
                while(true){
                    int x = i + rotate[k][0];
                    int y = j + rotate[k][1];
                    if(x < n && y < m && x >= 0 && y >= 0 && !full[x][y]){
                        result.add(matrix[x][y]);
                        full[x][y] = true;
                        i = x;
                        j = y;
                    }
                    else break;
                    
                }
            }
        }
        return result;
    }
}
//[1 ,2 ,3 ,4 ],
//[5 ,6 ,7 ,8 ],
//[9 ,10,11,12]