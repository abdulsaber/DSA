package Practice.DAY-33;

public class verticalOrder {
    ArrayList<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Queue<Pair> q = new LinkedList<>();
        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
        
        q.add(new Pair(0, root));
        while(!q.isEmpty()){
            Pair cur = q.poll();
            int key = cur.hd;
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<Integer>());
            }
            map.get(key).add(cur.node.data);
            if(cur.node.left != null){
                q.add(new Pair(key-1,cur.node.left));
            }
            if(cur.node.right != null){
                q.add(new Pair(key+1,cur.node.right));
            }
        }
        
        for(ArrayList<Integer> e: map.values()){
            list.addAll(e);
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

