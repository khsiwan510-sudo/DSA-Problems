/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return head = null;
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        // if(size==1 || size ==) head = null;
        temp = head;
        int i = 1;
        while( i < size/2){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return head;




        
    }
}