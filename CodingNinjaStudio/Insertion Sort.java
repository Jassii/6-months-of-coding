import java.util.* ;
import java.io.*; 

public class Solution {
	public static void insertionSort(int n , int[] arr) 
	{
		//insertion sort..
		int i,j;
		//when the last element comes, it will be at correct position
		for(i=1;i<n;i++)
		{
			int temp = arr[i];
			for(j=i-1;j>=0;j--)
			{
				if(arr[j]>temp)
				{
					//right shift elements
					arr[j+1] = arr[j];
				}
				else
				{
					break;
				}
			}
			arr[j+1] = temp;
		}
	}
}
