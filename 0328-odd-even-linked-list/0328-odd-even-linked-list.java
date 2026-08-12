class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode odd = dummy1;
        ListNode even = dummy2;
        ListNode temp = head;
        int i = 0;
        while(temp!=null){
            if(i%2==0){
                odd.next = temp;
                odd = odd.next;
            }
            else{
                even.next = temp;
                even = even.next;
            }
            temp = temp.next;
            i++;
        }
        even.next = null;
        odd.next = null;
        odd.next = dummy2.next;        
        return dummy1.next;
    }
}