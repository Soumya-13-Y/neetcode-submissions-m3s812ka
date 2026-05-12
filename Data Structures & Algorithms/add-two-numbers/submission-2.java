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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode();
        ListNode temp=head;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0){
            int n1=l1!=null?l1.val:0;
            int n2=l2!=null?l2.val:0;
            int n3=n1+n2+carry;
          carry=n3/10;
          ListNode curr=new ListNode(n3%10);
          temp.next=curr;
          temp=temp.next;
          if(l1!=null){
            l1=l1.next;}
            if(l2!=null){
            l2=l2.next;}

        }
        return head.next;
    }
}
