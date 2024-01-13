import java.util.ArrayList;
import java.util.*;


public class Solution 
{
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) 
	{
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();  //min heap..
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); //max heap..
    //result array list
		ArrayList<Integer> res = new ArrayList<>();
		//traverse the array
    int i;
		for(i=0;i<n;i++)
		{
			maxHeap.add(arr.get(i));
			minHeap.add(arr.get(i));
		}

		//pop elements from the max heap till k-1, inorder to get the kth largest and smallest element
		while(k>1)
		{
			minHeap.poll();
			maxHeap.poll();
			k--;
		}
  //the peek element of both the priority queue will have the smallest and largest element
		res.add(minHeap.peek());
		res.add(maxHeap.peek());
    
    //return the final array list..
		return res;
	}
}
