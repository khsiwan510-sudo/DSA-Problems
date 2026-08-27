class Solution {
    private TreeNode helper(TreeNode root, int val){
        if(root == null) return null;
        if(root.val == val) return root;
        else if(root.val > val) return searchBST(root.left, val);
        else return searchBST(root.right, val);
    }
    public TreeNode searchBST(TreeNode root, int val) {
        return helper(root, val);
    }
}