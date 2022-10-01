public class rightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null) return list;
        int level = 0;
        rightSideView(root,list,level);
        
        
        return list;
    }
    
    void rightSideView(TreeNode root, ArrayList<Integer> list ,int level){
        if(root == null) return;
        
        if(list.size() == level) list.add(root.val);
        
        rightSideView(root.right,list,level+1);
        rightSideView(root.left,list,level+1);
    }
    
}