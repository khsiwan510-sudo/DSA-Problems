class Solution{
    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        if(!isSameTree(p.left, q.left)) return false;
        if(!isSameTree(p.right, q.right)) return false;
        return true;
    }
}
//    M - 1: ArrayList
// class Solution {
//     public void addPre(TreeNode root, List<Integer> ans){
//         if(root == null){
//             ans.add(100000);
//             return;
//         }
//         ans.add(root.val);
//         addPre(root.left, ans);
//         addPre(root.right, ans);
//     }
//     public void addPost(TreeNode root, List<Integer> ans){
//         if(root == null){
//             ans.add(100000);
//             return;
//         }        
//         addPost(root.right, ans);
//         addPost(root.left, ans);
//         ans.add(root.val);
//     }
//     public boolean isSameTree(TreeNode p, TreeNode q) {
//         List<Integer> ans = new ArrayList<>();
//         addPre(p, ans);
//         addPost(q, ans);
//         int i = 0, j = ans.size()-1;
//         while(i<j){
//             if(ans.get(i).equals(ans.get(j))){
//                 i++; j--;
//                 continue;
//             }
//             else return false;            
//         }
//         return true;
        
//     }
// }