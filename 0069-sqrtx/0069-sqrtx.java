class Solution {
    public int mySqrt(int x) {
        long lo = 0, hi = x, root = -1;
        while(lo<=hi){
            long mid = (lo+hi)/2;
            if(mid*mid == x) return (int)mid;
            else if(mid*mid > x) hi = mid-1;
            else{
                root = mid;
                lo = mid+1;
            }
        }return (int)root;
        
    }
}