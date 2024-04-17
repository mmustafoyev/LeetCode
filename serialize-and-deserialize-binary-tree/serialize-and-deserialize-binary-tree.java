/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    private StringBuilder s = new StringBuilder();
    private int index = 0;
    public String serialize(TreeNode root) {
        buildString(root);
        return s.toString();
    }

    private void buildString(TreeNode root) {
        if(root == null) {
            s.append("null,");
            return;
        }        s.append(root.val + ",");
        buildString(root.left);
        buildString(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] strs = data.split(",");
        return buildTree(strs);
    }

    private TreeNode buildTree(String[] strings) {
        if(index >= strings.length || "null".equals(strings[index])){
            index++;
            return null;
        }
        TreeNode tree = new TreeNode(Integer.parseInt(strings[index++]));
        tree.left = buildTree(strings);
        tree.right = buildTree(strings);
        return tree;
    }

}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
