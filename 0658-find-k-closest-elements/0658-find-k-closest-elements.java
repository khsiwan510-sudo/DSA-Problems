class Pair implements Comparable<Pair> {
    int num;
    int diff;
    Pair(int diff, int num){
        this.num = num;
        this.diff = diff;
    }
    public int compareTo(Pair p){
        if(this.diff == p.diff) return this.num - p.num;
        return this.diff - p.diff;
    }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < arr.length; i++){
            int diff = Math.abs(arr[i] - x);
            pq.add(new Pair(diff, arr[i]));
            if(pq.size() > k) pq.remove();
        }
        for(int i = 0; i < k; i++){
            Pair top = pq.remove();
            ans.add(top.num);
        }
        Collections.sort(ans);
        return ans;
    }
}