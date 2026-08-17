class Solution {
    public ListNode helper(ListNode curr, ListNode prev, ListNode forwd){
        if(curr==null) return prev;
        forwd = curr.next;
        curr.next = prev;
        prev = curr;
        curr = forwd;
        return helper(curr, prev, forwd);
    }
    public ListNode reverseList(ListNode head) {
        // M - 3 -> Recursive Method
        return helper(head,null,null);



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