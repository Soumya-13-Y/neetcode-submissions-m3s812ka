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
    public ListNode reverseList(ListNode head) {
        ListNode a=head;
        ListNode b=null;
        while(a!=null){
            ListNode c=a.next;
            a.next=b;
b=a;
            a=c;
        }
        return b;
    }
}
