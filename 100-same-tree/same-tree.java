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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null &&q==null)
           return true;
        if(p==null && q!=null)
           return false;
        if(q==null && p!=null)
           return false;

           if(p.val==q.val){
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
           }
           return false;
    }
}

/**
if root value of p,q is same then we cheak left side of root value of both and right value of both
 */