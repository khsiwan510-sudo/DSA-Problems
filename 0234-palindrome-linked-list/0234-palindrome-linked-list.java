class Solution {
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode forwd = null;
        ListNode prev = null;
        while(curr!=null){
            forwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forwd;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        // Break List into two list
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;

        // Reverse List2 
        head2 = reverse(head2);

        // compare to get answer
        while(head2!=null){
            if(head.val != head2.val) return false;
            head = head.next;
            head2 = head2.next;
        }
        return true;


        // ArrayList<Integer> ans = new ArrayList<>();
        // ListNode temp = head;
        // while(temp!=null){
        //     ans.add(temp.val);
        //     temp = temp.next;
        // }
        // int i = 0, j = ans.size()-1;
        // while(i<j){
        //     if(ans.get(i) != ans.get(j)) return false;
        //     i++; j--;
        // }
        // return true;
    }
}