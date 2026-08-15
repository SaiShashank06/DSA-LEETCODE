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
       int minDist=Integer.MAX_VALUE;
      Integer prev=null;
    public void inorder(TreeNode root){
       
        if(root==null) return;

        inorder(root.left);

        if(prev!=null){
            minDist=Math.min(minDist,root.val-prev);

        }
        prev=root.val;
        inorder(root.right);
    }
    public int minDiffInBST(TreeNode root) {
        inorder(root);

        return minDist;
    }
}

/**
Intuition
Since this is a Binary Search Tree (BST), performing an inorder traversal gives the node values in sorted order. The minimum difference between any two nodes in a sorted sequence will always be found between adjacent elements, not arbitrary pairs.

Instead of storing the entire inorder traversal in an ArrayList and then computing differences, we can optimize space by calculating the minimum difference during the traversal itself. We only need to remember the previously visited node because that is the only candidate that can produce the minimum difference with the current node.

This avoids unnecessary storage and makes the solution more space efficient.

Approach
Perform an inorder traversal (Left → Root → Right).
Maintain a variable prev to store the previously visited node value.
At each node:
If prev exists, compute the difference between current node and prev.
Update the minimum difference if needed.
Update prev to the current node value.
Continue traversal.
Return the minimum difference found.
This works because inorder traversal guarantees values are visited in ascending order.

Complexity
Time complexity:
O(n)
We visit every node exactly once.

Space complexity:
O(h)
Where h is the height of the tree (recursion stack).
In the worst case (skewed tree) this becomes O(n), but in a balanced tree it is O(log n).
 */