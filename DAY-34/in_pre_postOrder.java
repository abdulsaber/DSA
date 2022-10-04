public class in_pre_postOrder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        
        TreeNode cur = root;
        
        while(cur != null || !stack.isEmpty()) {
            
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            
            TreeNode pop = stack.pop();
            ans.add(pop.val);
            
            cur = pop.right;
        }
        
        return ans;
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);
        
        while(!stack.isEmpty()) {
            TreeNode pop = stack.pop();
            
            ans.add(pop.val);
            
            if(pop.right != null) {
                stack.push(pop.right);
            }
            if(pop.left != null) {
                stack.push(pop.left);
            }
        }
        
        return ans;
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        ArrayDeque<TreeNode> s1 = new ArrayDeque<>();
        ArrayDeque<TreeNode> s2 = new ArrayDeque<>();
        
        s1.push(root);
        while(!s1.isEmpty()) {
            TreeNode pop = s1.pop();
            
            s2.push(pop);
            if(pop.left != null) {
                s1.push(pop.left);
            }
            if(pop.right != null) {
                s1.push(pop.right);
            }
        }
        
        while(!s2.isEmpty()) {
            ans.add(s2.pop().val);
        }
        return ans;
    }
    
}