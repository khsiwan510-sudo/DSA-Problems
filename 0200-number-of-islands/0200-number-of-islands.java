class Pair {
    int x;
    int y;
    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Solution {
    public void bfs(int x, int y, char[][] grid, boolean[][] visited){
        int m = grid.length, n = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(x,y));
        visited[x][y] = true;
        while(q.size() > 0){
            Pair front = q.remove();
            int row = front.x, col = front.y;
            // top -> row-1, col
            if(row > 0){
                if(grid[row-1][col] == '1' && visited[row-1][col] == false){
                    q.add(new Pair(row-1, col));
                    visited[row-1][col] = true;
                }
            }
            // bottom -> row+1, col
            if((row+1) < m){
                if(grid[row+1][col] == '1' && visited[row+1][col] == false){
                    q.add(new Pair(row+1, col));
                    visited[row+1][col] = true;
                }
            }
            // left -> row, col-1
            if((col-1) >= 0){
                if(grid[row][col-1] == '1' && visited[row][col-1] == false){
                    q.add(new Pair(row, col-1));
                    visited[row][col-1] = true;
                }
            }
            // right -> row, col+1
            if((col+1) < n){
                if(grid[row][col+1] == '1' && visited[row][col+1] == false){
                    q.add(new Pair(row, col+1));
                    visited[row][col+1] = true;
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int count = 0;
        int m = grid.length, n = grid[0].length;
        boolean visited[][] = new boolean[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == '1' && visited[i][j] == false){
                    bfs(i, j, grid, visited);
                    count++;
                }
            }
        }
        return count;        
    }
}