import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution
{
    public static int maximumProfit(ArrayList<Integer> prices)
    {
        // Write your code here.
        
        //brute force approach..O(n^2)
//         int i,j;
//         int n = prices.size();
//         int max=0;
//         for(i=0;i<n-1;i++)
//         {
//             for(j=i+1;j<n;j++)
//             {
//                 if(prices.get(j)>prices.get(i))
//                 {
//                     max = Math.max(max,prices.get(j)-prices.get(i));
//                 }
//             }
//         }
//         return max;
        
        //optimzal approach O(n)
        int i;
        int n = prices.size();
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(i=0;i<n;i++)
        {
            min = Math.min(min,prices.get(i));
            max = Math.max(max,prices.get(i)-min);
        }
        return max;
    }
}
