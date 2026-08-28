class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        if(root.val < val) root.right = insertIntoBST(root.right, val);
        else root.left = insertIntoBST(root.left, val);
        return root;
    }
    // void attach(TreeNode root, int val){
    //     if(root == null) return;
    //     if(root.val < val){
    //         if(root.right == null) root.right = new TreeNode(val);
    //         else // root.right != null 
    //             attach(root.right, val);
    //     }
    //     else{ // root.val > val
    //         if(root.left == null) root.left = new TreeNode(val);
    //         else // root.left != null
    //             attach(root.left, val);
    //     }
    // }
    // public TreeNode insertIntoBST(TreeNode root, int val) {
    //     if(root == null) return new TreeNode(val);
    //     attach(root, val);
    //     return root;
    // }
}