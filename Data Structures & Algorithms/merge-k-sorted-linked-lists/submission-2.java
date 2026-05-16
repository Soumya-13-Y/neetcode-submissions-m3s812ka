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
        ListNode head=lists[0];
        for(int i=1;i<lists.length;i++){
 head=mergeTwoSortedList(head,lists[i]);
        }
        return head;
    }
ListNode mergeTwoSortedList(ListNode l1,ListNode l2){
    if(l1==null && l2==null){
        return null;
    }
    ListNode head=new ListNode();
    ListNode temp=head;
    while(l1!=null && l2!=null){
        if(l1.val<l2.val){
            temp.next=l1;
            l1=l1.next;
        }else{
            temp.next=l2;
            l2=l2.next;
        }
        temp=temp.next;
    }
    if(l1!=null){
        temp.next=l1;
    }else{
        temp.next=l2;
    }
    return head.next;
}

}
