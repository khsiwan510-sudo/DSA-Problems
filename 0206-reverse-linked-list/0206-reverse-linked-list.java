class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode f = null; 
        ListNode c = head;
        ListNode p = null;
        while(c!=null){
            f = c.next;
            c.next = p;
            p = c;
            c = f;            
        }
        return p;
    }
}