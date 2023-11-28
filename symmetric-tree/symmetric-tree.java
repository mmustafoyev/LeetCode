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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        if(root.left != null && root.right != null)
            return toCheck(root.left, root.right);
        else if (root.left == null && root.right == null)
            return true;
        return false;
    }
    public boolean toCheck(TreeNode left, TreeNode right){
        if((left != null && right == null) || (left == null && right != null))
           return false;
        else if(left == null && right == null)
            return true;
        if(left.val != right.val) 
            return false;
        return toCheck(left.left, right.right) && toCheck(left.right, right.left);
    }
}