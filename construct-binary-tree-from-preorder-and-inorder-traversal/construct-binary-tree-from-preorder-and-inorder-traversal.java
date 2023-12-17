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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder == null || inorder == null || preorder.length == 0 || inorder.length == 0)
            return null;
        TreeNode tree = new TreeNode(preorder[0]);
        int rootIndex = findIndex(inorder, preorder[0]);

        //build right side
        tree.right = buildTree(Arrays.copyOfRange(preorder, rootIndex + 1, preorder.length),
                            Arrays.copyOfRange(inorder, rootIndex + 1, inorder.length));
        
        //build left
        tree.left = buildTree(Arrays.copyOfRange(preorder, 1, rootIndex + 1),
                            Arrays.copyOfRange(inorder, 0, rootIndex));
        
        return tree;
    }
    private int findIndex(int[] inorder, int num){
        int i = 0;
        for(; i < inorder.length; i++){
            if(inorder[i] == num){
                break;
            }
        }
        return i;
    }
}