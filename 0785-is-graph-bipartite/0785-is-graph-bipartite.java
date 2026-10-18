class Solution {
    public boolean bfs(int src, int[] color, int[][] graph){
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        color[src] = 1;
        while(!q.isEmpty()){
            int front = q.poll();
            int col = color[front];
            for(int j : graph[front]){
                if(color[j] == 0){
                    q.add(j);
                    color[j] = 3-col;
                }
                else if(color[j] == col) return false;
            }
        }
        return true;

    }
    public boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length];
        // 1 -> green color
        // 2 -> red color
        // 0 -> no color/ unvisited
        for(int i = 0; i < graph.length; i++){
            if(color[i] == 0){
                if(!bfs(i, color, graph)) return false;
            }
        }
        return true;
    }
}