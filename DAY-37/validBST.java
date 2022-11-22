public class validBST {
    public boolean isValidBST(TreeNode root) {
        long max = Long.MAX_VALUE;
        long min = Long.MIN_VALUE;
        return isValidBST(root, min, max);
    }
    public boolean isValidBST(TreeNode root, long min, long max){
        if(root == null) return true;
        
        if(root.val >= max || root.val <= min) return false;
        
        return isValidBST(root.left, min, root.val) &&
            isValidBST(root.right,root.val,max);
    }
    
}