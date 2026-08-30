class Solution {
    private void revInorder(TreeNode root, ArrayList<TreeNode> ans){
        if(root == null) return;
        revInorder(root.right, ans);
        ans.add(root);
        revInorder(root.left, ans);
    }
    public TreeNode convertBST(TreeNode root) {
        ArrayList<TreeNode> ans = new ArrayList<>();
        revInorder(root, ans);
        int sum = 0;
        for(int i = 0; i < ans.size(); i++){
            int data = ans.get(i).val;
            sum += data;
            ans.get(i).val = sum;
        }
        return root;
    }
}