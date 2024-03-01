import java.io.*;
import java.util.* ;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) 
	{

		//optimzal approach
		HashMap<Integer,Integer> map = new HashMap<>();
		
		int maxIndex=0; //max sum to be zero
		
		int sum=0;
		//traverse the array..
		int i;
		for(i=0;i<arr.size();i++)
		{
			//find the sum.
			sum = sum + arr.get(i);
			
			//check if the sum==0
			if(sum==0)
			{
				maxIndex=i+1;
			}

			//check if the hashmap contains the sum or not..
			else
			{
				if(map.containsKey(sum))
				{
					maxIndex = Math.max(maxIndex,i-map.get(sum));
				}
				else
				{
					map.put(sum,i); //sum is entered with its index value
				}
			}
		}
		return maxIndex;

		//better approach -> O(n^2)

		//find out all the subarrays
		// int maxSize=0;

		// int i,j;
		// for(i=0;i<arr.size();i++)
		// {
		// 	int sum=0;
		// 	for(j=i;j<arr.size();j++)
		// 	{	
		// 		sum = sum + arr.get(j);
		// 		//check whether the sum ==0
		// 		if(sum==0)
		// 		{
		// 			maxSize = Math.max(maxSize,j-i+1); //size of the subarray 
		// 		}
		// 	}
		// }
		// return maxSize;



		////brute force approach approx -> O(n^3)

		//find out all the subarrays
		// int maxSize=0;

		// int i,j;
		// for(i=0;i<arr.size();i++)
		// {
		// 	for(j=i;j<arr.size();j++)
		// 	{
		// 		int sum=0;

		// 		//now traverse from i to j.
		// 		for(int k=i;k<=j;k++)
		// 		{
		// 			sum = sum + arr.get(k);
		// 		}

		// 		//check whether the sum ==0
		// 		if(sum==0)
		// 		{
		// 			maxSize = Math.max(maxSize,j-i+1); //size of the subarray 
		// 		}
		// 	}
		// }
		// return maxSize;
	}
}
