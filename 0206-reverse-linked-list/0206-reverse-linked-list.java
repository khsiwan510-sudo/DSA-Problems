class Solution {
    // public ListNode helper(ListNode curr, ListNode prev){
    //     if(curr==null) return prev;
    //     ListNode forwd = curr.next;
    //     curr.next = prev;
    //     prev = curr;
    //     curr = forwd;
    //     return helper(curr, prev);
    // }
    public ListNode reverseList(ListNode head) {
        if(head ==null || head.next == null) return head;
        ListNode a = head.next;
        head.next = null;
        ListNode b = reverseList(a);
        a.next = head;
        return b;
        
        // M - 3 -> Recursive Method
        // return helper(head,null);

        // M - 2 -> Iterative 
        // ListNode f = null; 
        // ListNode c = head;
        // ListNode p = null;
        // while(c!=null){
        //     f = c.next;
        //     c.next = p;
        //     p = c;
        //     c = f;            
        // }
        // return p;
    }
}