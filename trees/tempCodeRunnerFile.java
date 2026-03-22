class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class BinaryTree {
    private int idx = -1;  // Make idx an instance variable to prevent conflicts in multiple calls

    public Node buildTree(int nodes[]) {  // Remove static
        idx++;
        if (idx >= nodes.length || nodes[idx] == -1) {  // Prevent array index out of bounds
            return null;
        }
        Node root = new Node(nodes[idx]);
        root.left = buildTree(nodes);
        root.right = buildTree(nodes);
        return root;
    }
}