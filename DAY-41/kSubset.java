import java.util.PriorityQueue;

public class kSubset {

    PriorityQueue<Integer> minHeap, maxHeap;
    boolean even;
    
    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        even = true;
    }
    
    public void addNum(int num) {
        if(even) {
            minHeap.offer(num);
            maxHeap.offer(minHeap.poll());
        } else {
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());
        }
        even = !even;
    }
    
    public double findMedian() {
        if(even) {
            return (minHeap.peek() + maxHeap.peek())/2.0;
        } else {
            return (double)maxHeap.peek();
        }
    }
}