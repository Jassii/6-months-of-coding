import java.util.*;
public class Solution 
{
    public static int bestTimeToBuyAndSellStock(int []prices) 
    {

        //optimal approach
        int maxProfit=0;
        //below variable will maintain the cp(low as possible) 
        int buy = Integer.MAX_VALUE;
        int i;
        for(i=0;i<prices.length;i++)
        {
            //if current price is less than previous buy price
            if(prices[i]<buy)
            {
                buy = prices[i];
            }

            maxProfit = Math.max(maxProfit,prices[i]-buy);
        }
        return maxProfit;

        //brute force approach. Time complexity is O(n^2) where n is the length of the 
        //array
        // int i,j;
        // int maxProfit = 0;
        // for(i=0;i<prices.length-1;i++)
        // {
        //     for(j=i+1;j<prices.length;j++)
        //     {
        //         //i'th index value will maintain the cp
        //         //j'th index value will maintian the sp
                
        //         //if sp is greater than cp..then only proceed
        //         if(prices[j]>prices[i])
        //         {
        //             maxProfit = Math.max(maxProfit,prices[j]-prices[i]);
        //         }
        //     }
        // }

        // return maxProfit;
    }
}
