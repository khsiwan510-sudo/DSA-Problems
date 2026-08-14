class Solution {
    public ListNode reverseList(ListNode head) {
        // M - 1: Time = O(n) and A.S = O(n)
        if(head==null) return head;
        ArrayList<ListNode> ans = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            ans.add(temp);
            temp = temp.next;
        }
        int n = ans.size();
        for(int i = n-1; i >= 1; i--){
            ans.get(i).next = ans.get(i-1);
        }
        ans.get(0).next = null;
        return ans.get(n-1);
    }
}