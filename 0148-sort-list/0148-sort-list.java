class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;        
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode list2 = slow.next;
        slow.next = null;
        ListNode list1 = head;
        list1 = sortList(list1);
        list2 = sortList(list2);
        return merge(list1,list2);
    }
    public ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                t.next = list1;
                list1 = list1.next;
            }
            else{
                t.next = list2;                
                list2 = list2.next;
            }
            t = t.next;
        }
        t.next = (list1==null)? list2:list1;
        return dummy.next;
    }
}