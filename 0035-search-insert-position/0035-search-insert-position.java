class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length, lo = 1, hi = n-2;
        if(nums[0] >= target) return 0;
        if(nums[n-1]<target) return n;
        if(nums[n-1]==target) return n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid] > target){
                if(nums[mid-1] < target) return mid;
                else hi = mid-1;
            }
            else if(nums[mid] < target){
                if(nums[mid+1] > target) return mid+1;
                else lo = mid+1;
            }
            else return mid;
        } return 1;
        
    }
}