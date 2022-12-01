public class avlTree {
    Node root;

    int height(Node n){
        if(n == null) return 0;

        return n.height;
    }

    int max(int a, int b){
        return a > b ? a: b;
    }

    int getBalance(Node node){
        if(node == null) return 0;
        return height(node.left)-height(node.right);
    }

    Node leftRotation(Node node){
        Node l = node.right;
        Node r = l.left;

        l.left = node;
        node.right = r;

        node.height = 1 + max(height(node.left),height(node.right));
        l.height = 1 + max(height(l.left),height(l.right));

        return l;
    }

    Node rightRotation(Node node){
        Node l = node.left;
        Node r = l.right;

        l.right = node;
        node.left = r;

        node.height = 1 + max(height(node.left),height(node.right));
        l.height = 1 + max(height(l.left),height(l.right));

        return l;
    }

    Node insert(Node node, int data){
        if(node == null) return(new Node(data));

        if(data < node.data){
            node.left = insert(node.left, data);
        }
        if(data > node.data){
            node.right = insert(node.right, data);
        }
        // Duplicate data not allowed
        else return node; 

        node.height = 1+ max(height(node.left),height(node.right));

        int balance = getBalance(node);

        if(balance > 1 && data < node.left.data){
            return rightRotation(node);
        }
        if( balance < -1 && data > node.right.data){
            return leftRotation(node);
        }
        if(balance > 1 && data > node.left.data){
            node.left = leftRotation(node.left);
            return rightRotation(node);
        }
        if(balance < -1 && data < node.right.data){
            node.right = rightRotation(node.right);
            return leftRotation(node);
        }
        return node;
    }
    
}





class Node{
    int data, height;
    Node left,right;

    public Node(int data){
        this.data = data;
        this.height = 1;
    }
}