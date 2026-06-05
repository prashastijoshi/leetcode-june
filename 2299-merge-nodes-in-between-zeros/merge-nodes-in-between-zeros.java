/** 4
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
    public ListNode mergeNodes(ListNode head) {

        ListNode dummy = new ListNode(0);
        ListNode curr = head;
        ListNode first = dummy;
        curr = curr.next;

        while(curr!=null){
            int sum = 0;
            while(curr.val!=0){
                sum+=curr.val;
                curr = curr.next;
                
            }
            // ListNode latest = new ListNode(sum);
            
            first.next = new ListNode(sum);
            first = first.next;
            curr = curr.next;
        }
    
        return dummy.next;
        
    }
}