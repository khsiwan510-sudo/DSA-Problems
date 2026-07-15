class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lo = 0, hi = nums.length-1, firstPos = -1, secPos = -1;
        int[] ans = new int[2];
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid] > target) hi = mid-1;
            else if(nums[mid] < target) lo = mid+1;
            else{
                firstPos = mid;
                hi = mid-1;
            }
        }
        lo = 0;
        hi = nums.length-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid] > target) hi = mid-1;
            else if(nums[mid] < target) lo = mid+1;
            else{
                secPos = mid;
                lo = mid+1;
            }
        }
        ans[0] = firstPos;
        ans[1] = secPos;
        return ans;        
    }
}