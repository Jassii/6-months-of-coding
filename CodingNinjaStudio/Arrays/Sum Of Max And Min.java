import java.util.* ;
import java.io.*; 
public class Solution 
{
  public static int sumOfMaxMin(int[] arr, int n) 
  {
      // Write your code here.
      // int sum=0;
      
      //need to find the maximum and minimum number in the array.
      int max=arr[0];
      int min=arr[0];
      int i;
      for(i=1;i<n;i++)
      {
        max = Math.max(arr[i],max);
        min = Math.min(arr[i],min);
      }

      return max+min;
  }
}
