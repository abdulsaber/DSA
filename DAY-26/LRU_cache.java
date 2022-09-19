import java.util.HashMap;

public class LRU_cache {
    public static void main(String[] args) {
        
    }
}
class LRUCache {
    Node head = new Node(0,0);
    Node tail = new Node(0,0);
    HashMap<Integer, Node> map = new HashMap<>();
    int capacity = 0;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node data = map.get(key);
            remove(data);
            insert(data);
            return data.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(capacity == map.size()){
            remove(tail.prev);
        }

        insert(new Node(key, value));
    }

    void remove(Node node){
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    void insert(Node node){
        map.put(node.key, node);
        Node secondnode = head.next;
        head.next = node;
        node.prev = head;
        secondnode.prev = node;
        node.next = secondnode;
    }

}
class Node{
    Node next, prev;
    int key, value;

    public Node(int key, int value){
        this.key = key;
        this.value = value;

    }
}
