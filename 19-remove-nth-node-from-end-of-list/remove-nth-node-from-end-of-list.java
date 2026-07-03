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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // if(head.next==null){
        //     return null;
        // }
        // ListNode curr = head;
        // ListNode follow = head;
        // int i = 0;

        // while(curr.next!=null){
        //     curr = curr.next;
        //     i++;
        //     if(i>n){
        //         follow = follow.next;
        //     }
        // }
        // follow.next = follow.next.next;
        // return head;
        


        ListNode dummy = new ListNode(0,head);
        ListNode left = dummy;
        ListNode right  = head;

        while(n!=0){
            right=right.next;
            n--;
        }
        while(right!=null){
            right=right.next;
            left = left.next;
        }
        left.next=left.next.next;
        return dummy.next;
    }
}