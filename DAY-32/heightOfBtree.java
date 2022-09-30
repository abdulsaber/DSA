public class heightOfBtree {
    public static void main(String[] args) {
        binaryTree bt = new binaryTree();
        Node root = bt.createBinaryTree();
    }    

    static int height(Node root){
        if(root == null) return 0;

        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left, right)+1;
    }
}
