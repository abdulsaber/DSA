public class convert {
    Node prev = null, head = null;
    Node bToDLL(Node root){
	    	bToDLLextra( root);
	    	return head;
    }
    
    void bToDLLextra(Node root){
        if(root == null) return;
        
        bToDLLextra(root.left);
        
        if(prev == null){
            head = root;
        }else{
            root.left = prev;
            prev.right = root;
        }
        
        prev = root;
        bToDLLextra(root.right);
        
    }
}
