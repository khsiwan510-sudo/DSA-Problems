class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode i = head; // i will travel LL
        ListNode temp = dummy;        
        while(i!=null){
            if(i.next==null || i.val != i.next.val){
                temp.next = i;
                temp = temp.next;
                i = i.next;
            }
            else{
                ListNode x = i;
                while(x!=null && i.val==x.val){
                    x = x.next;
                }
                i=x;
            }
        }
        temp.next = i;
        return dummy.next;
    }
}