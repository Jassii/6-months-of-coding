import java.util.* ;
import java.io.*; 
public class Solution {
	public static void selectionSort(int arr[], int n) 
	{
		int i,j;
		//number of rounds
		for(i=0;i<n-1;i++)
		{ 
			//i'th index will later store the smallest value..
			
			 int min_index = i;   //index of the min value..
			
			//traverse from the position i and find smallest element
			//j=i+1 bcoz, above in min you have already considered.
			for(j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min_index])
				{
					min_index = j;
				}
			}
			
			//now swap the values at i'th and j'th position..
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
		}
	}
}
