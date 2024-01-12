import java.util.* ;
import java.io.*; 
public class Solution
{
	public static int[] buildMinHeap(int[] arr)
	{
		// Write your code here

		//build a min heap.
		arr = buildMin(arr,arr.length);
		return arr;
	}
	
	//function to build a min heap.
	public static int[] buildMin(int arr[], int n)
	{
		//traverse back from (n-1)/2 nodes..
		for(int i=(n-1)/2;i>=0;i--)
		{
			heapify(arr,n,i);
		}
		return arr;
	}
	
	//function to min_heapify
	public static void heapify(int arr[],int n,int i)
	{
		int smallest = i;
		int left = 2*i+1;
		int right = 2*i+2;
		if(left<n && arr[left]<arr[smallest])
		{
			smallest = left;
		}
		if(right<n && arr[right]<arr[smallest])
		{
			smallest = right;
		}

		if(smallest!=i)
		{
			//swap the elements and then heapify
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
			heapify(arr, n, smallest);
		}
	}
}
