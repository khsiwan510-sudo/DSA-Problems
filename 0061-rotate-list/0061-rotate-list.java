class Solution {
    public int length(ListNode head){
        ListNode size = head;
        int len = 0;
        while(size!=null){
            len++;
            size = size.next;
        }
        return len;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        int n = length(head);
        k = k % n;
        if(k==0) return head;
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;
        for(int i = 1; i <= k+1; i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next; // k+1 node from last
            fast = fast.next; // end of LL
        }
        temp = slow.next;
        slow.next = null;
        ListNode end = temp;
        while(end.next!=null){
            end = end.next;
        }
        end.next = head;
        return temp;
    }
}