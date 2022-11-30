public class floorAndCiel {
    public static int ciel(Node root, int input){
        if(root == null) return -1;

        if(root.data == input) return root.data;

        if(root.data < input) return ciel(root.right, input);

        int ciel = ciel(root.left,input);

        return (ciel >= input? ciel: root.data);

    }

    public static int floor(Node root, int input){
        if(root == null) return -1;

        if(root.data == input) return root.data;

        if(root.data > input) return ciel(root.left, input);

        int floor = ciel(root.right,input);

        return (floor <= input && floor != -1? floor: root.data);

    }
    
}

class Node{
    Node left, right;
    int data;

    public Node(int data){
        this.data = data;
    }
}