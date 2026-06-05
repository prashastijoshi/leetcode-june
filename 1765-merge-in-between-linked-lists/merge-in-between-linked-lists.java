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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        // ListNode head = list1;
        ListNode curr = list1;
        int count=0;
        while(count<a-1){
            curr=curr.next;
            count++;
        }
        ListNode head=curr;
        
        // int cnt = a;
        while(count<=b){
            curr=curr.next;
            count++;
        }
        // curr=curr.next;
        head.next=list2;
        while(list2.next!=null){
            list2 = list2.next;
        }
        list2.next = curr;
        return list1;

        
    }
}