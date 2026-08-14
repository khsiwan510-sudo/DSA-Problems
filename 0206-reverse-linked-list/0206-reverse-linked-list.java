class Solution {
    public ListNode reverseList(ListNode head) {
        // M - 1: Time = O(n) and A.S = O(n)
        if(head==null || head.next==null) return head;
        ArrayList<ListNode> ans = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            ans.add(temp);
            temp = temp.next;
        }
        int n = ans.size();
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        for(int i = n-1; i >= 1; i--){
            ListNode t = ans.get(i);
            ListNode t2 = ans.get(i-1);
            t.next = t2;
            curr.next = t;
            curr = curr.next;
        }
        ans.get(0).next = null;
        return dummy.next;
    }
}