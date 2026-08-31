class Pair {
    long max;
    long min;
    Pair(long max, long min){
        this.max = max;
        this.min = min;
    }
}
class Solution {
    public Pair maxMin(TreeNode root, boolean[] flag){
        if(root == null) return new Pair(Long.MIN_VALUE, Long.MAX_VALUE);
        Pair lst = maxMin(root.left, flag);
        Pair rst = maxMin(root.right, flag);
        long val = root.val;
        long mx = Math.max(root.val, Math.max(lst.max, rst.max));
        long mn = Math.min(root.val, Math.min(lst.min, rst.min));
        if(lst.max >= val || rst.min <= val) flag[0] = false;
        return new Pair(mx, mn);
    }
    public boolean isValidBST(TreeNode root) {
        boolean[] flag = {true};
        maxMin(root, flag);
        return flag[0];
    }
}