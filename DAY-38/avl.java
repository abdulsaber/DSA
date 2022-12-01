

public class avl {
    static void inOrder(Node node) {
        if (node != null) {
            
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }
 
    public static void main(String[] args) {
        avlTree tree = new avlTree();
 
        /* Constructing tree given in the above figure */
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 25);
 
        /* The constructed AVL Tree would be
             30
            /  \
          20   40
         /  \     \
        10  25    50
        */
        System.out.println("Inorder traversal" +
                        " of constructed tree is : ");
        inOrder(tree.root);
    }
}

