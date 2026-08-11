class Solution {
    public int countNegatives(int[][] grid) {
        int negCount = 0;
        for(int[] a: grid){
            for(int ele: a){
                if(ele<0) negCount++;
            }
        }
        return negCount;
    }
}