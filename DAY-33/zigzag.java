

public class zigzag {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root == null) return list;
        
        int level = 0;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            ArrayList<Integer> curList = new ArrayList<>();
            int n = q.size();
            for(int i = 0; i < n; i++){
                TreeNode cur = q.poll();
                curList.add(cur.val);
                if(cur.left != null) q.add(cur.left);
                if(cur.right != null) q.add(cur.right);
            }
            if(level%2 == 1){
                Collections.reverse(curList);
            }
            list.add(curList);
            level++;
        }
        
        return list;
    }
}
