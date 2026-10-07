class Solution {
    public void bfs(int node, boolean[] visited, int[][] isConnected){
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visited[node] = true;
        while(q.size() > 0){
            int front = q.remove();
            for(int j = 0; j < isConnected.length; j++){
                if(isConnected[front][j] == 1 && visited[j] == false){
                    q.add(j);
                    visited[j] = true;
                }
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {        
        int count = 0;
        boolean[] visited = new boolean[isConnected.length];
        for(int i = 0; i < isConnected.length; i++){
            if(!visited[i]){
                bfs(i, visited, isConnected);
                count++;
            }
        }
        return count;
    }
}