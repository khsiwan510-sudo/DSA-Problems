class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-2);
        ListNode less = dummy1;
        ListNode more = dummy2;
        ListNode temp = head;
        while(temp!=null){
            if(temp.val < x){
                less.next = temp;
                less = less.next;                
            }
            else{
                more.next = temp;
                more = more.next;                
            }
            temp = temp.next;
        }
        less.next = dummy2.next;
        more.next = null;
        return dummy1.next;
    }
}