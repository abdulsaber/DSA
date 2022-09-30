public class traversal {
    public static void main(String[] args) {
        binaryTree bt = new binaryTree();

        Node root = bt.createBinaryTree();

    }
    static void inOrder(Node root){
        if(root == null) return;

        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    static void preOrder(Node root){
        if(root == null) return;

        System.out.println(root.data);
        inOrder(root.left);
        inOrder(root.right);
    }

    static void postOrder(Node root){
        if(root == null) return;

        inOrder(root.left);
        inOrder(root.right);
        System.out.println(root.data);
    }
}
