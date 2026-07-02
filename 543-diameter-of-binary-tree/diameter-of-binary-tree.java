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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] res = new int[1];
        dfs(root,res);
        return res[0];
        
    }
    public int dfs(TreeNode root, int[] res){
        if(root==null){
            return 0;
        }
        int leftheight = dfs(root.left,res);
        int rightheight = dfs(root.right,res);
        res[0] = Math.max(leftheight+rightheight,res[0]);
        return Math.max(leftheight,rightheight)+1;
    }
}