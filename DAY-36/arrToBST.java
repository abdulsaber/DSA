public class arrToBST {
    public TreeNode sortedArrayToBST(int[] arr) {
        return bST(arr, 0, arr.length-1);
        
    }
    public TreeNode bST(int[] arr, int l, int r){
        if(l > r) return null;
        
        int mid = (l+r)/2;
        TreeNode node = new TreeNode(arr[mid]);
        node.left = bST(arr,l,mid-1);
        node.right = bST(arr,mid+1,r);
        
        return node;
    }
    
}