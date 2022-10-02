public class bottomView {
    static ArrayList<Integer> bottomView(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer,Integer> map = new TreeMap<>();
        
        q.add(new Pair(0, root));
        while(!q.isEmpty()){
            Pair cur = q.poll();
            int hd = cur.hd;
            //if(!map.containsKey(hd)){
                map.put(hd,cur.node.data);
                
            //}
            if(cur.node.left != null) q.add(new Pair(hd-1,cur.node.left));
            if(cur.node.right != null) q.add(new Pair(hd+1,cur.node.right));
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            list.add(entry.getValue());
        }
        return list;
       
   }
   static class Pair{
       int hd;
       Node node;
       public Pair(int hd, Node node){
           this.hd = hd;
           this.node = node;
       }
       
   }
}
