class Solution {
    // public void postOrderRecursive(TreeNode root, List<Integer> ans){
    //     if(root == null) return;
    //     postOrderRecursive(root.left, ans);
    //     postOrderRecursive(root.right, ans);
    //     ans.add(root.val);
    // }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        // postOrderRecursive(root, ans);
        // Iterative 
        if(root == null) return ans;        
        else{
            Stack<TreeNode> st = new Stack<>();
            st.push(root);
            while(st.size() > 0){
                TreeNode top = st.pop();
                ans.add(top.val);
                if(top.left != null) st.push(top.left);
                if(top.right != null) st.push(top.right);
            }
            int i = 0, j = ans.size()-1;
            while(i<j){
                int temp = ans.get(i);
                ans.set(i,ans.get(j));
                ans.set(j,temp);
                i++;
                j--;
            }
            return ans;
        }
    }
}