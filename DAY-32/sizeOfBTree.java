public class sizeOfBTree {
    public static void main(String[] args) {
        binaryTree bt = new binaryTree();
        Node root = bt.createBinaryTree();
    }

    static int size(Node root){
        if(root == null) return 0;
        int left = size(root.left);
        int right = size(root.right);

        return (left+right+1);
    }
}
