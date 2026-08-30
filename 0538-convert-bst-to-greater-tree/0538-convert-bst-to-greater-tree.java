class Solution {
    private void revInorder(TreeNode root, int[] sum){
        if(root == null) return;
        revInorder(root.right, sum);
        sum[0] += root.val;
        root.val = sum[0];
        revInorder(root.left, sum);
    }
    public TreeNode convertBST(TreeNode root) {
        ArrayList<TreeNode> ans = new ArrayList<>();
        int[] sum = {0};
        revInorder(root, sum);        
        return root;
    }
}