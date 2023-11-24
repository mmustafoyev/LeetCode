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
    public int maxDepth(TreeNode root) {
        Queue<List<TreeNode>> queue = new LinkedList<>();
        int count = 0;
        if (root == null) return count;
        queue.offer(List.of(root));
        while (!queue.isEmpty()) {
            List<TreeNode> nodes = queue.poll();
            List<TreeNode> list = new ArrayList<>();
            for (TreeNode node : nodes) {
                if (node.left != null)
                    list.add(node.left);
                if (node.right != null)
                    list.add(node.right);
            }
            if(!list.isEmpty())
                queue.offer(list);
            count++;
        }
        return count;
    }
}