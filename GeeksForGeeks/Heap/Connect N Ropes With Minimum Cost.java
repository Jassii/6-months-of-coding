import java.util.*;
public class Solution 
{
    public static long connectRopes(int[] arr)
    {
        //Write your code here
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); //min heap
        int i;
        for(i=0;i<arr.length;i++)
        {
            minHeap.add(arr[i]);
        }

        //now will be taking two minimum ropes, adding(connecting) it and
        //pushing it back in the queue
        long cost = 0; //maintain the cost
        while(minHeap.size()>1)
        {
            int a = minHeap.poll();
            int b = minHeap.poll();
            cost = cost + a + b;
            minHeap.add(a+b); //only add a + b
        }
      //return the cost
        return cost;
    }
}
