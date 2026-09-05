class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone: stones) pq.add(stone);        
        while(pq.size() > 0){
            if(pq.size() == 1) return pq.remove();
            int stoneOne = pq.remove();
            int stoneTwo = pq.remove();
            if(stoneOne == stoneTwo) continue;
            else if(stoneOne > stoneTwo) pq.add(stoneOne-stoneTwo);
        }
        return 0;
    }
}