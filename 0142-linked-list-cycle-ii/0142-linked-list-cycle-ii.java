public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = head;
        int flag = 0;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                flag = 1;
                while(temp!=slow){
                    slow = slow.next;
                    temp = temp.next;
                }
                return slow;
            }
        }
        return (flag==0)? null:head;
    }
}