import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;


public class Solution 
{
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) 
	{
		//min heap
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		//max heap
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

		//traverse arr
		int i;
		for(i=0;i<n;i++)
		{
			minHeap.add(arr.get(i));
			maxHeap.add(arr.get(i));
		}

		//kth smallest element and largest element
		while(k>1)
		{
			minHeap.poll();
			maxHeap.poll();
			k--;
		}
		ArrayList<Integer> res = new ArrayList<>();
		res.add(minHeap.peek());
		res.add(maxHeap.peek());
		return res;
	}
}
