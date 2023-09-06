import java.util.*;

class Solution {
    public int numSquares(int n) {
    if(n <= 0) return 0;
        int maxSquare = (int) Math.sqrt(n);
        int[] squares = new int[maxSquare];
        for(int i = 1; i <= maxSquare; i++){
            squares[i - 1] = i * i;
        }
        boolean[] visited = new boolean[n+1];
        int level = 0;
        visited[0] = false;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            level++;
            for(int i = 0; i < size; i++){
                int current = queue.poll();
                for(int square : squares){
                    int next = current + square;
                    if(n == next)
                        return level;
                    else if(next < n && !visited[next]){
                        visited[next] = true;
                        queue.offer(next);
                    }
                }
            }
        }
        return -1;
    }
}
