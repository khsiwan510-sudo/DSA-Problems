class Solution {
    public void flatten(TreeNode root) {
        TreeNode curr = root;
        while(curr != null){
            if(curr.left != null){
                TreeNode pred = curr.left;
                while(pred.right != null){
                    pred = pred.right;
                }
                pred.right = curr.right;
                curr.right = curr.left;
                curr.left = null; 
            }
            curr = curr.right;
        }
    }
    // public void flatten(TreeNode root) {
    //     if(root == null) return;
    //     TreeNode lst = root.left; // left subtree
    //     TreeNode rst = root.right;
    //     root.left = null;
    //     root.right = null;
    //     flatten(lst);
    //     flatten(rst);
    //     root.right = lst;
    //     TreeNode last = root; // yeh lst ka last element hoga
    //     while(last.right != null){
    //         last = last.right;
    //     }
    //     last.right = rst;
    // }

    // // A.S => O(n) recursive height => O(h);
    // public void preOrderTraversal(TreeNode root, ArrayList<TreeNode> ans){
    //     if(root == null) return;
    //     ans.add(root);
    //     preOrderTraversal(root.left, ans);
    //     preOrderTraversal(root.right, ans);
    // }
    // public void flatten(TreeNode root) {
    //     if(root == null) return;
    //     ArrayList<TreeNode> ans = new ArrayList<>();
    //     preOrderTraversal(root, ans);
    //     TreeNode curr = root;
    //     int i = 1;
    //     while(i < ans.size()){
    //         curr.left = null;
    //         curr.right = ans.get(i);
    //         curr = curr.right;
    //         i++;
    //     }
    //     curr.right = null;
    // }
}