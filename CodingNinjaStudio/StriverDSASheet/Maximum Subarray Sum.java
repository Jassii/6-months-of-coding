import java.util.* ;
import java.io.*; 

public class Solution 
{	
	public static long maxSubarraySum(int[] arr, int n) 
  {
    //optimal approach
    int i;
    long maxSum=Long.MIN_VALUE;
    long currSum=0;
    for(i=0;i<n;i++)
    {
      currSum = Math.max(arr[i],currSum+arr[i]);
      if(currSum<0)
      {
        currSum=0;
      }
      maxSum = Math.max(currSum,maxSum);
    }
    return maxSum;
	}
}
