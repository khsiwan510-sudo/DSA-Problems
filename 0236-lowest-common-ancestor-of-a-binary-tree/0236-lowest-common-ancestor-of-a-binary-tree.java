class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root.val == p.val || root.val == q.val) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left != null && right != null) return root;
        return (left != null) ? left : right;
    }
}
// class Solution {
//     public boolean exits(TreeNode root, int val){
//         if(root == null) return false;
//         if(root.val == val) return true;
//         return exits(root.left, val) || exits(root.right, val);
//     }
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         if(root == null ) return null;
//         if(root.val == p.val || root.val == q.val) return root;
//         boolean pLiesInLeft = exits(root.left, p.val);
//         boolean qLiesInLeft = exits(root.left, q.val);
//         if(pLiesInLeft && qLiesInLeft) return lowestCommonAncestor(root.left, p, q);
//         else if(!pLiesInLeft && !qLiesInLeft) return lowestCommonAncestor(root.right, p, q);
//         else return root;
//     }
// }