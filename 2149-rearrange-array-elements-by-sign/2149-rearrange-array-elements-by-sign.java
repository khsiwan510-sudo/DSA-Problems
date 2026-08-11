class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length, i = 0;
        int[] pos = new int[n/2];
        int[] neg = new int[n/2];
        int j = 0, k = 0;
        while(i<n){

            if(nums[i]>0) pos[j++] = nums[i++];
            else neg[k++] = nums[i++];
        }
        k = 0;
        j = 0;
        for(i = 0; i < n; i++){
            if(i%2==0) nums[i] = pos[j++];
            else nums[i] = neg[k++];
        }
        return nums;
        
    }
}