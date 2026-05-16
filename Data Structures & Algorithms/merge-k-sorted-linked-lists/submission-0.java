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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        ArrayList<Integer> l=new ArrayList<>();
        for(ListNode a:lists){
            traverselist(a,l);
        }
        Collections.sort(l);
        ListNode head=new ListNode();
        ListNode temp=head;
        for(Integer al:l){
            ListNode n=new ListNode(al);
            temp.next=n;
            temp=temp.next;
        }
return head.next;
    }

    void traverselist(ListNode head,ArrayList l){
        while(head!=null){
            l.add(head.val);
            head=head.next;
        }
    }
}
