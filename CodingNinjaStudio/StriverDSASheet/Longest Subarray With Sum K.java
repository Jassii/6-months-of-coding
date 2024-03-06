import java.util.*;
public class Solution 
{
    public static int longestSubarrayWithSumK(int []a, long k) 
    {
        //optimized approach
        int i;
        long sum=0;
        int maxLen=0;
        //map with (sum,index) value
        Map<Long,Integer> map = new HashMap<>();
        for(i=0;i<a.length;i++)
        {
            sum = sum + a[i];

            if(sum==k)
            {
                maxLen=Math.max(maxLen,i+1);
            }

            if(map.containsKey(sum-k))
            {
                //if it is found, then get its index and subtract
                //with the current index
                int len=i-map.get(sum-k); //get the length

                //check for the maximum length
                maxLen=Math.max(maxLen,len);
            }
            
            //if you simply put the sum in the map even though
            //it exists, then its value will be changed, and it can
            //decrease the length of the array..which we don't want..
            //that is why we are checking if it is not present then push it..
            if(!map.containsKey(sum))
            {
                map.put(sum,i);
            }
        }

        return maxLen;


        //brute force approach is to find all the subarrays
        //and whose subarray sum matches with the k..
        //return its length..

        //it will take of around O(n^2)...

        // int i,j;
        // int maxSize=0;
        // for(i=0;i<a.length;i++)
        // {
        //     long sum=0;
        //     for(j=i;j<a.length;j++)
        //     {
        //         //find the sum..
        //         sum = sum + a[j];

        //         //check if the sum matches with k
        //         if(sum==k)
        //         {
        //             //find its length..
        //             maxSize=Math.max(maxSize,j-i+1);
        //         }
        //     }
        // }
        // return maxSize;
    }
}
