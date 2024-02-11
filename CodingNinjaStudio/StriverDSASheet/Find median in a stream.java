class Solution
{
    static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    static PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    
    //Function to insert heap.
    public static void insertHeap(int x)
    {
        // add your code here
        if(maxHeap.isEmpty() || maxHeap.peek()>=x)
        {
            maxHeap.add(x);
        }
        else
        {
            minHeap.add(x);
        }
        //after inserting make sure you are balancing the heap..
        balanceHeaps();
    }
    
    //Function to balance heaps.
    public static void balanceHeaps()
    {
       // add your code here
       if(maxHeap.size()>minHeap.size()+1)
       {
           minHeap.add(maxHeap.poll());
       }
       else if(maxHeap.size()<minHeap.size())
       {
           maxHeap.add(minHeap.poll());
       }
    }
    
    //Function to return Median.
    public static double getMedian()
    {
        // add your code here
        if(maxHeap.size()==minHeap.size())
        {
            return maxHeap.peek()/2.0+minHeap.peek()/2.0;
        }
        return maxHeap.peek();
    }
}
