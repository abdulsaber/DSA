import java.util.HashSet;

public class twoSum {

    HashSet<Integer> set = new HashSet<>();
    public boolean findTarget(TreeNode root, int key) {
        if(root == null) return false;
        
        if(set.contains(key-root.val)) return true;
        
        set.add(root.val);
        
        return findTarget(root.left, key) || findTarget(root.right, key);
       
    }
}