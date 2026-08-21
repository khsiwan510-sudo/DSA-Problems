class Solution {
    static boolean flag;
    public int levels(TreeNode root){
        if(root == null) return 0;
        int leftLevels = levels(root.left);
        int rightLevels = levels(root.right);
        if(Math.abs(leftLevels - rightLevels) > 1 ) flag = false;
        return 1 + Math.max(leftLevels, rightLevels);
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        flag = true;
        levels(root);
        return flag;
    }
}

// class Solution {
//     public int levels(TreeNode root){
//         return (root == null) ? 0 : (1 + Math.max(levels(root.left), levels(root.right)));
//     }
//     public boolean isBalanced(TreeNode root) {
//         if(root == null) return true;
//         int leftLevels = levels(root.left);
//         int rightLevels = levels(root.right);
//         if(Math.abs(leftLevels - rightLevels) > 1) return false;
//         return isBalanced(root.left) && isBalanced(root.right);        
//     }
// }