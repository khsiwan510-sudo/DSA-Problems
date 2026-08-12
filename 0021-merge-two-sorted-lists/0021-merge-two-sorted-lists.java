class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
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