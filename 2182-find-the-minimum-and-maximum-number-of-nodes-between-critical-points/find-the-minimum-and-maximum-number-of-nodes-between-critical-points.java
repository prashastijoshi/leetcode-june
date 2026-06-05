/*3/5
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
    public boolean critical(int prev, int cur, int nxt){
        return((cur>prev && cur>nxt) || cur<prev && cur <nxt);
    }
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        
        
        ListNode prev = head;
        ListNode cur = head.next;
        ListNode nxt = cur.next;

        int minDist = Integer.MAX_VALUE;
        int maxDist = Integer.MIN_VALUE;

        int i=1;
        int first_crit_idx = 0;
        int latest_crit_idx = 0;

        while(nxt!=null){
            if(critical(prev.val,cur.val,nxt.val)){
                if(first_crit_idx!=0){
                    maxDist = i-first_crit_idx;
                    minDist = Math.min(minDist, i-latest_crit_idx);
                }
                
                else{
                    first_crit_idx = i;
                }
                latest_crit_idx = i;

            }
            prev = cur;
            cur = nxt;
            nxt = nxt.next;
            i++;
        }
        if(minDist ==Integer.MAX_VALUE){
            return new int[]{-1,-1};
        }
        else{
            return new int[]{minDist,maxDist};
        }
    }
}