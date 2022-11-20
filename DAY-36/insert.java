public class insert {
    public TreeNode insertIntoBST(TreeNode root, int key) {
        if(root == null) return new TreeNode(key);
        TreeNode cur = root, parent = null;
        while(cur != null){
            if(key > cur.val){
                parent = cur;
                cur = cur.right;
            }else{
                parent = cur;
                cur = cur.left;
            }
        }
        TreeNode node = new TreeNode(key);
        if(parent == null) return node;
        
        if(parent.val > key) parent.left = node;
        else parent.right = node;
        
        return root;
    }
}
