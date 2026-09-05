class Pair implements Comparable<Pair> {
    int num;
    int freq;
    Pair(int num, int freq){
        this.num = num;
        this.freq = freq;
    }
    public int compareTo(Pair p){
        if(this.freq == p.freq) return this.num - p.num;
        return this.freq - p.freq;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int num: map.keySet()){
            int freq = map.get(num);
            pq.add(new Pair(num, freq));
            if(pq.size() > k) pq.remove();
        }
        int[] ans = new int[k];
        for(int i = 0; i < k; i++){
            Pair top = pq.remove();
            ans[i] = top.num;
        }
        return ans;
    }
}