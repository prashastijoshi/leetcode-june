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
    public ListNode removeNodes(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        int maxsofar=prev.val;
        ListNode dummy = prev;
        ListNode previous = prev;
        ListNode current = prev.next;
        while(current!=null){
            if(current.val < maxsofar){
                previous.next = current.next;
            }
            else{
                maxsofar = current.val;
                previous = current;
            }
            current =current.next;
        }
        ListNode prev1 = null;
        while(dummy!=null){
            ListNode temp1 = dummy.next;
            dummy.next = prev1;
            prev1 = dummy;
            dummy = temp1;
        }
        return prev1;


        
    }
}