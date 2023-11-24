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
        if(root == null) return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        // The maximum depth is the maximum of left and right subtree depths, plus 1 for the current level.
        return Math.max(leftDepth, rightDepth) + 1;
        
    }
}
/*
return maxDepth(root.left) > maxDepth(root.right)?
                maxDepth(root.left) + 1 :
                maxDepth(root.right) + 1;
        */
/*
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
        return count;*/