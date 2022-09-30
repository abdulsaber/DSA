public class nodesFromK {
    public static void main(String[] args) {
        binaryTree bt = new binaryTree();
        Node root = bt.createBinaryTree();
        fromK(root, 2);
    }    

    static void fromK(Node root, int k){
        if(root == null) return;
        if(k == 0) {
            System.out.println(root.data);
            return ;
        }
        fromK(root.left, k-1);
        fromK(root.right, k-1);

    }
}
