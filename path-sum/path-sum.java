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
    public boolean hasPathSum(TreeNode root, int targetSum) {
         return toApply(root, 0, targetSum);
    }
    public boolean toApply(TreeNode root, int sum, int targetSum){
        if(root == null)
            return false;
        sum += root.val;
        if(root.right == null && root.left == null)
            return sum == targetSum;
        return toApply(root.left, sum , targetSum) || toApply(root.right, sum, targetSum);
    }
}