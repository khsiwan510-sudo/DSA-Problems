class Solution {
    public void preOrderTraversal(TreeNode root, ArrayList<TreeNode> ans){
        if(root == null) return;
        ans.add(root);
        preOrderTraversal(root.left, ans);
        preOrderTraversal(root.right, ans);
    }
    public void flatten(TreeNode root) {
        if(root == null) return;
        ArrayList<TreeNode> ans = new ArrayList<>();
        preOrderTraversal(root, ans);
        TreeNode curr = root;
        int i = 1;
        while(i < ans.size()){
            curr.left = null;
            curr.right = ans.get(i);
            curr = curr.right;
            i++;
        }
        curr.right = null;
    }
}