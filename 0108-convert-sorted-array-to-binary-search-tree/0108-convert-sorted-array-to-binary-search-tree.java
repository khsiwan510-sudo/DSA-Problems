class Solution {
    public TreeNode convert(int[] arr, int lo, int hi){
        if(lo > hi) return null;
        int mid = lo + (hi-lo)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = convert(arr, lo, mid-1);
        root.right = convert(arr, mid+1, hi);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length;
        return convert(nums, 0, n-1);
    }
}