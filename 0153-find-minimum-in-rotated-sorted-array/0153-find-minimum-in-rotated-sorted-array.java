class Solution {
    public int findMin(int[] nums) {
        int lo = 1, hi = nums.length-1, min = Integer.MAX_VALUE;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(nums[0] <= nums[mid] && nums[mid-1]<nums[mid]) lo = mid+1;
            else{ // mid to n-1 sorted                
                min = nums[mid];
                hi = mid-1;                            
            }
        }
        if(min > nums[0]) return nums[0];
        return min;
    }
}