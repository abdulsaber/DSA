public class minHeap {
    int a[];
    int capacity;
    int n;

    public minHeap(int capacity){
        this.capacity = capacity;
        n = 0;
        a = new int[capacity+1];
    }
    void swap(int a, int b){
        int temp = a;
        a = b;
        b =temp;
    }

    int size(){
        return n;  
    }

    public void insert(int key) throws Exception{
        if(n+1 == capacity) throw new Exception("Heap is full");

        n++;
        a[n] = key;
        int i = n;
        while(i>1){
            int parent = i/2;
            if(a[parent] > a[i]){
                swap(a[parent], a[i]);
                i = parent;
            }else return;
        }
    }
    
    public int extract(int key) throws Exception{
        if(n == 0) throw new Exception("Heap is empty");

        int res = a[1];
        a[1] = a[n];
        n--;

        int i = 1;
        while(i <= n){
            int left = 2*i;
            int right = 2*i + 1;

            int smallest = i;
            if(left <= n && a[left] < a[smallest]){
                smallest = left;
            }
            if(right <= n && a[right] < a[smallest]){
                smallest = right;
            }
            if(smallest != i){
                swap(a[smallest], a[i]);
                i = smallest;
            }else break;
        }
        return res;
    }

    void print(){
        for (int e : a) {
            System.out.print(e+" ");
        }
    }
}
