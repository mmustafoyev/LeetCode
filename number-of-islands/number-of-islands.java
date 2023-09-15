import java.util.*;

class Solution {
   private Stack<int[]> stack = new Stack<>();
    private int[] dir = { 0, -1, 0, 1, 0};//direction
    private int rowLen;
    int colLen;

    public int numIslands(char[][] grid) {
        rowLen = grid.length;
        colLen = grid[0].length;
        int number = 0;
        boolean[][] visited = new boolean[rowLen][colLen];
        for(int i = 0; i < rowLen; i++){
            for(int j = 0; j < colLen; j++){
                if(grid[i][j] == '1'){
                    stack.push(new int[]{i,j});
                    dfs(visited, grid, stack);
                    number++;}
            }
        }
        return number;
    }

    public void dfs(boolean[][] visited, char[][] grid, Stack<int[]> stack){
        if(stack.isEmpty())return;
        int row1 = stack.peek()[0];
        int col1 = stack.pop()[1];
        for(int i = 0; i < dir.length - 1; i++){
            int row = row1 + dir[i];
            int col = col1 + dir[i + 1];
            if(row >= 0 && col >= 0 && row < rowLen && col < colLen && !visited[row][col] &&  grid[row][col] == '1'){

                stack.push(new int[]{row, col});
                visited[row][col] = true;
                grid[row][col] = '0';
                dfs(visited, grid, stack);
            }
        }
        dfs(visited, grid, stack);
    }

}