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
     public boolean valid(TreeNode root,long min,long max){
        if(root==null) return true;
         if(root.val<=min || root.val>=max) return false;


         return valid(root.left,min,root.val) && valid(root.right,root.val,max);
     } 
    public boolean isValidBST(TreeNode root) {
        return valid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
}
/**

The standard solution is to maintain the valid range (min, max) for every node.
For every node:

Left subtree values must lie in (min, root.val).
Right subtree values must lie in (root.val, max).

This correctly catches violations anywhere in the tree.

Time Complexity: O(n)
Space Complexity: O(h) (where h is the height of the tree due to recursion).

 */