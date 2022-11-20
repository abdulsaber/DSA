public class Search {
    public TreeNode searchBST(TreeNode root, int key) {
        TreeNode cur = root;
        while(cur!= null){
            if(cur.val == key){
                return cur;
            }
            else if(cur.val > key){
               cur = cur.left;
            }else cur = cur.right;
        }
        return null;
    }
    
}
