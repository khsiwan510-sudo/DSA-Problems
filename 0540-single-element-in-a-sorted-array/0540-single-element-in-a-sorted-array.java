class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[n-1] != nums[n-2]) return nums[n-1];
        // Binary search approach
        int lo = 0, hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) return nums[mid];
            int firstIndex = mid, secIndex = mid;
            if(nums[mid] == nums[mid-1]) firstIndex = mid-1;
            else secIndex = mid+1;
            int leftCount = firstIndex - lo;
            int rightCount = hi - secIndex;
            if(leftCount % 2 == 0) lo = secIndex+1;
            else hi = firstIndex-1;            
        }
        return -1;
        
    }
}