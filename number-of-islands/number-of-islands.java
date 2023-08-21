import java.util.*;

class Solution {
    public int numIslands(char[][] grid) {
        int step = 0;
        int row = grid.length;
        int col = grid[0].length;
        for(int i = 0; i < row; i++){
            for(int j = 0;j < col; j++){
                if(grid[i][j] == '1'){
                    step++;
                    getBfs(grid, i, j);
                }
            }
        }

        return step;
    }

    private static void getBfs(char[][] grid, int startRow, int startCol) {

        int numRows = grid.length;
        int numCols = grid[0].length;
        int[] dir = {-1, 0, 1, 0, -1};
        List<List<Integer>> list = new ArrayList<>();
        Queue<List<Integer>> queue = new LinkedList<>();
        queue.offer(List.of(startRow,startCol));
        grid[startRow][startCol] = '0';
        while(!queue.isEmpty()){
            int rowt = queue.peek().get(0);
            int colt = queue.poll().get(1);
            for (int i = 0; i < 4; i++) {
                if((rowt + dir[i] < numRows) && (colt + dir[i+1] < numCols) &&
                        (rowt + dir[i] >= 0) && (colt + dir[i+1] >= 0) && 
                   grid[rowt + dir[i]][colt + dir[i + 1]] == '1'){
                    grid[rowt + dir[i]][colt + dir[i + 1]] = '0';
                    queue.offer(List.of(rowt + dir[i], colt + dir[i + 1]));
                }
            }
        }
    }
}