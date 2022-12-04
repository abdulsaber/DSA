public class heapSort {
    int a[];
	int capacity;
	int n;
	
	// ignore the a[0] 
	public heapSort(int a[]) {
		this.a = a;
		this.capacity = a.length-1;
		this.n = a.length-1;
		buildHeap();
	}
	
	public heapSort(int capacity) {
		this.capacity = capacity;
		n = 0;
		a = new int[capacity+1];
	}

    private void swap(int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
    void heapify(int i) {
		while(i <= n) {
			int left = 2*i;
			int right = 2*i+1;
			
			int smallest = i;
			if(left <= n && a[left] < a[smallest]) {
				smallest = left;
			}
			if(right <= n && a[right] < a[smallest]) {
				smallest = right;
			}
			
			if(smallest != i) {
				swap(smallest, i);
				i = smallest;
			} else break;
		}
	}
	
//	O(n) builds a heap from a given array
	void buildHeap() {
		for(int i = n; i>0; i--) {
			heapify(i);
		}
	}
	
	void heapSort() throws Exception {
		int newN = n;
		for(int i = 1; i<=newN; i++) {
			int x = extractMin();
			System.out.print(x+" ");
		}
	}
    int extractMin() throws Exception {
		if(n == 0) throw new Exception("Heap is empty");
		
		int result = a[1];
		a[1] = a[n];
		n--;
		int i = 1;
		while(i <= n) {
			int left = 2*i;
			int right = 2*i+1;
			
			int smallest = i;
			if(left <= n && a[left] < a[smallest]) {
				smallest = left;
			}
			if(right <= n && a[right] < a[smallest]) {
				smallest = right;
			}
			
			if(smallest != i) {
				swap(smallest, i);
				i = smallest;
			} else break;
		}
		
		return result;
	}
}
