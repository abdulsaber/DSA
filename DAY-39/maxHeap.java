public class maxHeap {
    int[] a;
    int n, capacity;

    public maxHeap(int capacity){
        this.capacity = capacity;
        n = 0;
        a = new int[capacity+1];
    }
    void swap(int a, int b){
        int temp = a;
        a = b;
        b =temp;
    }

    void insert(int key) throws Exception{
        if(n+1 == capacity) throw new Exception("Heap is full");

        n++;
        a[n] = key;
        int i = n;

        while(i >= 0){
            int parent = 1*2;
            if(a[i] > a[parent]){
                swap(a[i], a[parent]);
                i = parent;
            }else return;
        }
    }

    int delete() throws Exception{
        if(n == 0) throw new Exception("Heap is empty");

        int ans = a[1];
        a[1] = a[n];
        n--;
        int i = 1;

        while(i <= n){
            int left = 2*i;
            int right = 2*i + 1;

            int largest = i;
            if(left <= n && a[largest] < a[left]){
                largest = left;
            }if(right <= n && a[largest] < a[right]){
                largest = right;
            }if(i != largest){
                swap(a[largest], a[i]);
                i = largest;
            }else break;
        }
        return ans;

    }

    void print(){
        for (int e : a) {
            System.out.print(e+" ");
        }
    }
    
}