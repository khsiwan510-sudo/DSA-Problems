class Solution {
    public int maximumCount(int[] nums) {
        int lo = 0, hi = nums.length-1, negCount = 0, posCount = nums.length;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;            
            if(nums[mid] >= 0) hi = mid-1;
            else{
                negCount = mid+1;
                lo = mid+1;
            }

        }
        lo = 0; 
        hi = nums.length-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid] <= 0) lo = mid+1;            
            else{
                posCount = mid;
                hi = mid-1;
            }            
        }
        int positiveCount = nums.length - posCount;
        if( negCount > positiveCount) return negCount;
        return positiveCount;
    }
}