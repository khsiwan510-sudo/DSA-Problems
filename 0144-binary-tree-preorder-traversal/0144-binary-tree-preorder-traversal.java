class Solution {
    // public void preOrderRecursive(TreeNode root, List<Integer> reqAns){
    //     if(root == null) return;
    //     reqAns.add(root.val);
    //     preOrderRecursive(root.left, reqAns);
    //     preOrderRecursive(root.right, reqAns);
    // }
    public void preOrder(TreeNode root, List<Integer> ans){
        if(root == null) return;
        // step-1: pop in stack and print
        // step-2: push right & then left child in a stack
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(st.size() > 0){
            TreeNode top = st.pop();
            ans.add(top.val);
            if(top.right != null) st.push(top.right);
            if(top.left != null) st.push(top.left);
        }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        // Recursive Method        
        // preOrderRecursive(root, ans);

        // Iterative Method
        preOrder(root, ans);
        return ans;
    }
}