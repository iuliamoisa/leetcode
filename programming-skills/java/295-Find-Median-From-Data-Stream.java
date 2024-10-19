class MedianFinder {
    Queue<Integer> minHeap = new PriorityQueue<>();
    Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());


    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        //O(n)
        if(maxHeap.size() == minHeap.size()){
            minHeap.offer(num);
            maxHeap.offer(minHeap.poll());
        }else{
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());
        }
    }
    
    public double findMedian() {
        //O(1)
        if(maxHeap.size() == minHeap.size()){
            return 1.0 * (maxHeap.peek() + minHeap.peek())/2;
        }
        return maxHeap.peek();
    }
}

// 1st approach:
    // array: addNum=O(1); findMedian=O(n log n)
// 2nd approach:
    // keep array sorted, addNum=O(n); findMedian=O(1)
//3rd approach:
    // addNum=O((n )log n); findMedian=O(1)

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
