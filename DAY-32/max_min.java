public class max_min {
    static int max_node = 0;
    public static void main(String[] args) {
        // binaryTree bt = new binaryTree();
        // Node root = bt.createBinaryTree();

        binaryTree tree = new binaryTree();
        tree.root = new Node(2);
        tree.root.left = new Node(7);
        tree.root.right = new Node(5);
        tree.root.left.right = new Node(6);
        tree.root.left.right.left = new Node(1);
        tree.root.left.right.right = new Node(11);
        tree.root.right.right = new Node(9);
        tree.root.right.right.left = new Node(4);

        System.out.println("Maximum: "+max(tree.root));
        System.out.println("Minimum: "+min(tree.root));
    }

    static int max(Node root){
        if(root == null) return 0;
        max_node = Math.max(max_node, root.data);
        max(root.left);
        max(root.right);

        return max_node;
    }

    static int min(Node root){
        if(root == null) return 0;
        max_node = Math.min(max_node, root.data);
        min(root.left);
        min(root.right);

        return max_node;
    }
}
