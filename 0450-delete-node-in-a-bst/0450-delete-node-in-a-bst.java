class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if(root.val > key){ // go left
            root.left = deleteNode(root.left, key);
        }else if(root.val < key){ // go right
            root.right = deleteNode(root.right, key);
        }else{ // root.val == key
            // node with zero child
            if(root.left == null && root.right == null) return null;
            // node with one child
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;
            // node with two child
            //find pred and save it
            //delete pred
            // set pred as root
            TreeNode pred = root.left;
            while(pred.right != null) pred = pred.right;
            root.left = deleteNode(root.left, pred.val);
            pred.right = root.right;
            pred.left = root.left;
            return pred;
        }
        return root;
    }
}