class Solution {
    public int search(int[] nums, int target) {                
        int n = nums.length;
        if (nums[0] == target) return 0;
        if (nums[n - 1] == target) return n - 1;
        int lo = 1, hi = n - 2;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if(nums[mid] == target) return mid;
            if(nums[lo] <= nums[mid]){ // lo to mid is sorted
                if(target >= nums[lo] && nums[mid] > target) hi = mid-1;
                else lo = mid+1;
            } else { // mid to hi is sorted
                if(target > nums[mid] && target <= nums[hi]) lo = mid+1;
                else hi = mid-1;
            }
        }
        return -1;
    }
}