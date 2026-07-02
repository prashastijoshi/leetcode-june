/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // private int sum=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        return preorder(root,low,high);
         
    }
    public int preorder(TreeNode root,int low, int high){
        if(root==null){
            return 0;
        }
        int sum=0;
        if(root.val >=low && root.val<=high){
            sum+=root.val;
        }
        
        sum+=preorder(root.left,low,high);
        sum+=preorder(root.right,low,high);
        return sum;

    }
}