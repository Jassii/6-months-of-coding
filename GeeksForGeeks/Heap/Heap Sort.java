import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
	public static ArrayList<Integer> heapSort(ArrayList<Integer> arr, int n) 
	{
		// Write your code here.

		//build a max-heap
		arr = buildHeap(arr,n);
		
		//after max heap is build, we know that the max element 
		//is at the front, move that element at the last position
		//and heapify it..(inorder to maintain the max element)
		for(int i=n-1;i>=0;i--)
		{
			//swap the first and i'th values
			int temp = arr.get(i);
			arr.set(i,arr.get(0));
			arr.set(0,temp);

			heapify(arr, i, 0);
		}
		return arr;
	}

	//build max heap
	public static ArrayList<Integer> buildHeap(ArrayList<Integer> arr, int n)
	{
		//move from n/2 nodes, as after that, it will be leaf nodes.
		for(int i=(n-1)/2;i>=0;i--)
		{
			heapify(arr,n,i);
		}
		return arr;
	}
	//heapify algorithm
	public static void heapify(ArrayList<Integer> arr, int n, int i)
	{
		int largest = i;
		int l = 2*i;
		int r = 2*i+1;
		
		if(l<n && arr.get(l)>arr.get(largest))
		{
			largest = l;
		}
		if(r<n && arr.get(r)>arr.get(largest))
		{
			largest = r;
		}

		if(largest!=i)
		{
			//swap
			int temp = arr.get(largest);
			arr.set(largest,arr.get(i));
			arr.set(i,temp);

			//heapify the new largest
			heapify(arr, n, largest);
		}
	}
}
