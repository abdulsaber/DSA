/**
 * ancestors
 */
public class ancestors {

    public static ArrayList<Integer> Ancestors(Node root, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        isPresent(root, target, ans);
        ans.remove(0);
        return ans;
    }
    
    public static boolean isPresent(Node root, int target, ArrayList<Integer> ans) {
        if(root == null) return false;
        if(root.data == target || isPresent(root.left, target, ans) || isPresent(root.right, target, ans)) {
            ans.add(root.data);
            return true;
        }
        return false;
    }
}