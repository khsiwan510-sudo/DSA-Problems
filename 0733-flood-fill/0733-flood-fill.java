class Solution {
    class Pair {
        int row;
        int col;
        Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length, n = image[0].length;
        Queue<Pair> q = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];
        int oldColor = image[sr][sc];
        if(image[sr][sc] == color ) return image;
        q.add(new Pair(sr, sc));
        image[sr][sc] = color;        
        visited[sr][sc] = true;
        while(!q.isEmpty()){
            Pair front = q.poll();
            int row = front.row, col = front.col;
            // top -> row-1, col
            if(row-1 >= 0){
                if(image[row-1][col] == oldColor && visited[row-1][col] == false){
                    image[row-1][col] = color;
                    visited[row-1][col] = true;
                    q.add(new Pair(row-1, col));
                }
            }
            // bottom -> row+1, col
            if((row+1) < m){
                if(image[row+1][col] == oldColor && visited[row+1][col] == false){
                    image[row+1][col] = color;
                    visited[row+1][col] = true;
                    q.add(new Pair(row+1, col));
                }
            }
            // left -> col-1,row
            if(col-1 >= 0){
                if(image[row][col-1] == oldColor && visited[row][col-1] == false){
                    image[row][col-1] = color;
                    visited[row][col-1] = true;
                    q.add(new Pair(row, col-1));
                }
            }
            // right -> col+1, row
            if((col+1) < n){
                if(image[row][col+1] == oldColor && visited[row][col+1] == false){
                    image[row][col+1] = color;
                    visited[row][col+1] = true;
                    q.add(new Pair(row, col+1));
                }
            }
        }
        return image;
    }    
}