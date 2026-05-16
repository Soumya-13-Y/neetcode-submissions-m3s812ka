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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prevLast=null;
        while(temp!=null){
       ListNode kNode=findkNode(temp,k);
       if(kNode ==null){
        if(prevLast!=null){
            prevLast.next=temp;
        }
        break;
       }
       ListNode nextNode=kNode.next;
       kNode.next=null;
       reverseList(temp);
       if(temp==head){
        head=kNode;
       }else{
        prevLast.next=kNode;
       }
       prevLast=temp;
       temp=nextNode;
        }
     return head;   
    }
    ListNode findkNode(ListNode temp ,int k){
       while (temp != null && k > 1) {
    temp = temp.next;
    k--;
}
        return temp;
    }
    ListNode reverseList(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode front =curr.next;
            curr.next=prev;
             prev = curr;
            curr = front;
        }
        return prev;
    }
}
