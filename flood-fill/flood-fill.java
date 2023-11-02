class Solution {
    int [] direction = {0, -1, 0, 1, 0};
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image.length < 1) return image;
        int sizeX = image.length;
        int sizeY = image[0].length;
        boolean [][] visited = new boolean[sizeX][sizeY];
        int oldOne = image[sr][sc];
        image[sr][sc] = color;
        if (oldOne == color) return image; // No need to do anything if the color is already the same.
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{sr,sc});
        while (!queue.isEmpty()){
            int[] curr = queue.poll();
            int x = curr[0];
            int y = curr[1];
            for (int i = 0; i < direction.length - 1; i++) {
                int tempX = x + direction[i];
                int tempY = y + direction[i + 1];
                if(tempX >=0 && tempX < sizeX && tempY >= 0 && tempY < sizeY &&
                 !visited[tempX][tempY] && image[tempX][tempY] == oldOne){
                    image[tempX][tempY] = color;
                    queue.offer(new int[]{tempX, tempY});
                    visited[tempX][tempY] = true;
                }
            }
        }
        return image;
    }
}