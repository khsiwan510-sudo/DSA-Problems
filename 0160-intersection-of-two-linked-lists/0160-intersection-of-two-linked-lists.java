public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        int sizeA = 0, sizeB = 0;
        while(tempA!=null){
            sizeA++;
            tempA = tempA.next;
        }
        while(tempB!=null){
            sizeB++;
            tempB = tempB.next;
        }
        tempA = headA;
        tempB = headB;
        int diff = sizeA-sizeB;
        if(diff<0){
            for(int i = 1; i <= (-1)*diff; i++){
                tempB = tempB.next;
            }
        }else{
            for(int i = 1; i <= diff; i++){
                tempA = tempA.next;
            }
        }
        while(tempA!=tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }
}