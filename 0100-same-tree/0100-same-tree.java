/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void addPre(TreeNode root, List<Integer> ans){
        if(root == null){
            ans.add(100000);
            return;
        }
        ans.add(root.val);
        addPre(root.left, ans);
        addPre(root.right, ans);
    }
    public void addPost(TreeNode root, List<Integer> ans){
        if(root == null){
            ans.add(100000);
            return;
        }        
        addPost(root.right, ans);
        addPost(root.left, ans);
        ans.add(root.val);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> ans = new ArrayList<>();
        addPre(p, ans);
        addPost(q, ans);
        int i = 0, j = ans.size()-1;
        while(i<j){
            if(ans.get(i).equals(ans.get(j))){
                i++; j--;
                continue;
            }
            else return false;            
        }
        return true;
        
    }
}