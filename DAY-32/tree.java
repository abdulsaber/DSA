public class tree {
    public static void main(String[] args) {
        binaryTree bt = new binaryTree();

        Node root = bt.createBinaryTree();
        print(root);
    }    

    static void print(Node root){
        if(root == null) return;
        System.out.println(root.data);
        print(root.left);
        print(root.right);
    }
}
