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
    private List<Integer> l1 = new ArrayList<>();
    private List<Integer> l2 = new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        helper(root1,l1);
        helper(root2,l2);
        return (l1.equals(l2));


    }

    public void helper(TreeNode root,List<Integer> list){
        if(root==null)return;
        if(root.left==null && root.right==null){
            list.add(root.val);
            return;
        }
        helper(root.left, list);
        helper(root.right, list);
        return;

    }
}