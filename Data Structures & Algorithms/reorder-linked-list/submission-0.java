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
    public void reorderList(ListNode head) {
           if (head == null || head.next == null) {
            return;
        }

        ListNode t=head;
        ListNode h=head;
        while(h!=null && h.next!=null){
            t=t.next;
            h=h.next.next;
        }

        ListNode prev=null;
        ListNode curr=t.next;
         t.next = null;
        while(curr!=null){
            ListNode front=curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }
        ListNode first = head;
        ListNode secondHalf = prev;
        while(secondHalf != null){
            ListNode temp1 = first.next;
            ListNode temp2 = secondHalf.next;
                first.next = secondHalf;
            secondHalf.next = temp1;
             first = temp1;
            secondHalf = temp2;


        }
        

    }
}
