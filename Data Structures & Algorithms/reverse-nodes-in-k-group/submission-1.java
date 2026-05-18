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
        ListNode prevLast=null;
        ListNode temp=head;
        while(temp!=null){
            ListNode kNode=findKNode(temp,k);
            if(kNode==null){
                if(prevLast!=null){
                    prevLast.next=temp;
                }
                break;
            }
            ListNode nextNode=kNode.next;
            kNode.next=null;
            reverseNode(temp);
            if(temp==head){
                head=kNode;
            }else{
                prevLast.next=kNode;
            }
            temp.next=nextNode;
prevLast=temp;
temp=nextNode;

        }
        return head;
    }

    ListNode findKNode(ListNode temp,int k){
        while(temp!=null && k>1){
        
            temp=temp.next;
            k--;
            }
        
return temp;
    }

    ListNode reverseNode(ListNode temp){
        ListNode prev=null;
        ListNode curr=temp;
        while(curr!=null){
            ListNode front=curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }
        return prev;
    }
}
