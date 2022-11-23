public class secondLargest {
    public static void main(String[] args) {
        Node n1 = new Node(50);
        n1.left = new Node(20);
        n1.right = new Node(60);
        n1.right.right = new Node(70);

        System.out.println(secndL(n1));
    }

    static int secndL(Node root){
        if(root == null) return 0;
        if(root.right == null) return root.left.data;

        Node parent = root;
        Node cur = root;
        while(cur.right != null){
            parent = cur;
            cur = cur.right;
        }
        return parent.data;
    }
}

class Node{
    int data;
    Node left, right;
    public Node(int data){
        this.data = data;
    }
}
