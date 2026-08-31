class Triplet {
    long max;
    long min;
    boolean isBST;
    Triplet(long max, long min, boolean isBST){
        this.max = max;
        this.min = min;
        this.isBST = isBST;
    }
}
class Solution {
    public Triplet maxMin(TreeNode root){
        if(root == null) return new Triplet(Long.MIN_VALUE, Long.MAX_VALUE, true);
        Triplet lst = maxMin(root.left);
        Triplet rst = maxMin(root.right);
        long val = root.val;
        long max = Math.max(val, Math.max(lst.max, rst.max));
        long min = Math.min(val, Math.min(lst.min, rst.min));
        boolean isBST = (val > lst.max) && (val < rst.min) && lst.isBST && rst.isBST;
        return new Triplet(max, min, isBST);
    }
    public boolean isValidBST(TreeNode root){
        return maxMin(root).isBST;
    }
}



// class Pair {
//     long max;
//     long min;
//     Pair(long max, long min){
//         this.max = max;
//         this.min = min;
//     }
// }
// class Solution {
//     public Pair maxMin(TreeNode root, boolean[] flag){
//         if(root == null) return new Pair(Long.MIN_VALUE, Long.MAX_VALUE);
//         Pair lst = maxMin(root.left, flag);
//         Pair rst = maxMin(root.right, flag);
//         long val = root.val;
//         long mx = Math.max(root.val, Math.max(lst.max, rst.max));
//         long mn = Math.min(root.val, Math.min(lst.min, rst.min));
//         if(lst.max >= val || rst.min <= val) flag[0] = false;
//         return new Pair(mx, mn);
//     }
//     public boolean isValidBST(TreeNode root) {
//         boolean[] flag = {true};
//         maxMin(root, flag);
//         return flag[0];
//     }
// }