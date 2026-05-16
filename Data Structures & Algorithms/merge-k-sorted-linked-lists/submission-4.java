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
int interval =1;
while(interval<lists.length){
    for(int i=0;i+interval<lists.length;i+=2*interval){
        lists[i]=mergeTwoSortedList(lists[i],lists[i+interval]);
        }
        interval=2*interval;
    }
    return lists[0];
}
ListNode mergeTwoSortedList(ListNode h1,ListNode h2){
    ListNode head=new ListNode();
    ListNode temp=head;
    while(h1!=null && h2!=null){
        if(h1.val<h2.val){
temp.next=h1;
h1=h1.next;
        }else{
            temp.next=h2;
h2=h2.next;
        }
        temp=temp.next;
    }
    if(h1!=null){
        temp.next=h1;
    }else{
        temp.next=h2;
    }
    return head.next;
}
    }
