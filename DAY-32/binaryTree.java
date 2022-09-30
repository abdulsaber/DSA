import java.util.*;

public class binaryTree{
    Scanner sc;
    Node root;
    public binaryTree(){
        sc = new Scanner(System.in);
    }

    Node createBinaryTree(){
        System.out.println("enter node data");
        int data = sc.nextInt();
        if(data == -1) return null;

        Node node = new Node(data);
        System.out.println("enter "+ data+"'s left data");
        node.left = createBinaryTree();

        System.out.println("enter "+ data+"'s right data");
        node.right = createBinaryTree();

        return node;
    }
    
}

class Node{
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }

}