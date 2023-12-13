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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder == null || postorder == null || inorder.length == 0 || postorder.length == 0)
            return null;
        int size = postorder.length;
        TreeNode tree = new TreeNode(postorder[size - 1]);
        
        int rootIndex = findRootIndex(inorder, postorder[size - 1]);

        tree.right = buildTree(Arrays.copyOfRange(inorder, rootIndex + 1, inorder.length),
                    Arrays.copyOfRange(postorder, rootIndex, postorder.length - 1));

            // build leftness
        tree.left = buildTree(Arrays.copyOfRange(inorder, 0, rootIndex),
                    Arrays.copyOfRange(postorder, 0, rootIndex));
        
        return tree;
    }

    private int findRootIndex(int[] inorder, int i) {
        int j = 0;
        for (; j < inorder.length; j++) {
            if (inorder[j] == i)
                return j;
        }
        return j;
    }
}