public class shortestDistance {
    public static int distanceBetweenTwo(Node root, Node a, Node b){
        if(root == null) return 0;

        if(a.data < root.data && b.data < root.data){
            return distanceBetweenTwo(root.left, a, b);
        }

        if(a.data > root.data && b.data > root.data){
            return distanceBetweenTwo(root.right, a, b);
        }

        if(a.data <= root.data && b.data >= root.data){
            return distanceFromRoot(root, a.data) + distanceFromRoot(root, b.data);
        }

        return 0;
    }

    public static int distanceFromRoot(Node root, int x){
        if(root == null) return 0;

        else if(root.data > x) return 1 + distanceFromRoot(root.left, x);

        return 1 + distanceFromRoot(root.right, x);
    }
    
}

class Node{
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}