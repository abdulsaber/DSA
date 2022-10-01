

public class leftView {
    ArrayList<Integer> leftView(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null) return list;
        int level = 0;
        leftView(root, level, list);
        
        return list;
      }
      void leftView(Node root, int level, ArrayList<Integer> list){
          if(root == null) return;
          
          if(list.size() == level){
              list.add(root.data);
          }
          leftView(root.left, level+1, list);
          leftView(root.right, level+1, list);
          
      }
}
