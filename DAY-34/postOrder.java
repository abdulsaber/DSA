package Practice.DAY-34;

public class postOrder {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        
        TreeNode cur = root, prev = null;
        while(cur != null || !stack.isEmpty()){
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            
            if(stack.peek().right == null || stack.peek().right == prev){
                prev= stack.pop();
                list.add(prev.val);
                
            }else{
                cur = stack.peek().right;
            }
        }
        
        
        return list;
    }
}
