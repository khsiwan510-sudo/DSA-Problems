class Solution {
    void inorder(TreeNode root, int[] ans){
        if(root == null) return;
        inorder(root.left, ans);
        ans[0]--;
        if(ans[0]==0){
            ans[1] = root.val;
            return;
        }
        inorder(root.right, ans);
        
    }
    public int kthSmallest(TreeNode root, int k) {
        int[] req = new int[2];
        req[0] = k;
        req[1] = -1; // if K is greater than tree length
        inorder(root, req);
        return req[1];
    }
    // //inorderTraversal of BST is always in sorted order;
    // private void inorderTraversal(TreeNode root, ArrayList<Integer> ans){
    //     if(root == null) return;
    //     inorderTraversal(root.left, ans);
    //     ans.add(root.val);
    //     inorderTraversal(root.right, ans);
    // }
    // public int kthSmallest(TreeNode root, int k) {
    //     ArrayList<Integer> ans = new ArrayList<>();
    //     inorderTraversal(root, ans);
    //     return ans.get(k-1);        
    // }
}