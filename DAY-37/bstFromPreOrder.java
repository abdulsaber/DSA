public class bstFromPreOrder {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode node = new TreeNode(preorder[0]);
        for(int i: preorder){
            createTree(i,node);
        }
        return node;
            
    }
    public TreeNode createTree(int value, TreeNode root){
        if(root == null){
            root = new TreeNode(value);
            return root;
        }
        if(value > root.val){
            root.right = createTree(value, root.right);
        }
        if(value < root.val){
            root.left = createTree(value, root.left);
        }
        
        return root;
    }
}
