public class levelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        ArrayList<Integer> curList = new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode cur = q.poll();
            if(cur == null){
                ans.add(curList);
                if(q.isEmpty()) return ans;
                q.add(null);
                curList = new ArrayList<>();
                
            }else{
                curList.add(cur.val);
                if(cur.left != null) q.add(cur.left);
                if(cur.right != null) q.add(cur.right);
            }
        }
        return ans;
    }    
}
