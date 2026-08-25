class Solution {
    class Pair {
        TreeNode node;
        int level;
        Pair(TreeNode node, int level){
            this.node = node;
            this.level = level;
        }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        if(root == null) return ans;
        else{
            Queue<Pair> p = new LinkedList<>();
            p.add(new Pair(root, 0));
            int currLevel = 0;
            while(p.size() > 0){
                Pair front = p.remove();
                if(front.level != currLevel){
                    if(currLevel % 2 != 0){
                        Collections.reverse(arr);
                    }
                    ans.add(new ArrayList<>(arr));
                    arr.clear();
                    currLevel++;
                }
                arr.add(front.node.val);
                if(front.node.left != null) p.add(new Pair(front.node.left, front.level+1));
                if(front.node.right != null) p.add(new Pair(front.node.right, front.level+1));                
            }
            if(currLevel % 2 != 0) Collections.reverse(arr);
            if(arr.size() > 0) ans.add(new ArrayList<>(arr));
            return ans;
        }
    }
}