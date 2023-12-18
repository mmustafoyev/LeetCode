/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null) return null;
        Queue<List<Node>> queue = new LinkedList<>();
        queue.add(List.of(root));
        while (!queue.isEmpty()){
            List<Node> list = queue.poll();
            List<Node> toAdd = new LinkedList<>();
            for(Node node : list){
                if(node.left != null) toAdd.add(node.left);
                if(node.right != null) toAdd.add(node.right);
            }
            for (int i = 1; i < list.size(); i++) {
                list.get(i - 1).next = list.get(i);
            }
            if(!toAdd.isEmpty())
                queue.offer(toAdd);
        }
        return root;
    }
}