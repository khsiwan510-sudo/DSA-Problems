class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 0, n = nums.length;
        while(i<n){
            if(i!=j){
                if(nums[i] != nums[j]){
                    j++;
                    nums[j] = nums[i];
                }
            }
            i++;
        }
        return j+1;
        
        
    }
}