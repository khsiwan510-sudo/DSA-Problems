class Solution {
    public boolean isSymmetric(TreeNode root) {
        invertTree(root.left);
        return isSameTree(root.left, root.right);
        
    }
    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        if(!isSameTree(p.left, q.left)) return false;
        if(!isSameTree(p.right, q.right)) return false;
        return true;
    }
    public void helper(TreeNode root){
        if(root == null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        helper(root.left);
        helper(root.right);
    }    
    public TreeNode invertTree(TreeNode root) {
        TreeNode ans = root;
        helper(root);
        return ans;
    }
}