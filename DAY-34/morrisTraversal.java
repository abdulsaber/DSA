public class morrisTraversal {
    static void traversal(Node node){
        if(node == null) ;
        Node cur = node;
        Node predessor = null;
        while(cur != null){
            if(cur.left == null){
                System.out.println(cur.data);
                cur = cur.right;
            }else{
                predessor = cur.left;
                while(predessor.right != null && predessor.right != cur){
                    predessor = predessor.right;
                    if(predessor.right == null){
                        predessor.right = cur;
                        cur = cur.left;
                    }else{
                        predessor.right = null;
                        System.out.println(cur.data);
                        cur = cur.right;
                    }
                }
            }
        }
    }
}
