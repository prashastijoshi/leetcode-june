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
    private int carry=0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode sum = new ListNode(0);
        ListNode head = sum;
        while(l1!=null && l2!=null){
            // ListNode sum = new ListNode(add(l1,l2));


            sum.next = new ListNode(add(l1.val,l2.val));
            sum=sum.next;
            l1=l1.next;
            l2=l2.next;
        }
        if(l1!=null){
            while(l1!=null){

            
            sum.next = new ListNode(add(l1.val,0));
            sum = sum.next;
            l1=l1.next;
            }
        }

        if(l2!=null){
            while(l2!=null){

            
            sum.next = new ListNode(add(l2.val,0));
            sum = sum.next;
            l2=l2.next;
            }
        }
        if(carry==1){
            sum.next = new ListNode(1);
        }


        return head.next;
        
    }
    public int add(int l1, int l2){
        
        int plus = l1+l2+carry;
        if(plus>9){
            carry=1;
            return plus%10;
        }
        else{
            carry=0;
            return plus;
        }

            
    }
}