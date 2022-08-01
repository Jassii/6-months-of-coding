class Solution 
{
    public int maxProfit(int[] prices) 
    {
        //brute force approach..O(n^2) approach..
        // int i,j;
        // int n = prices.length;
        // int max=0;
        // for(i=0;i<n-1;i++)
        // {
        //     for(j=i+1;j<n;j++)
        //     {
        //         if(prices[j]>prices[i])
        //         {
        //             max = Math.max(max,prices[j]-prices[i]);
        //         }
        //     }
        // }
        // return max;
        
        //now optimal approach..
        int i;
        int max = 0;
        int min = Integer.MAX_VALUE;
        int n = prices.length;
        for(i=0;i<n;i++)
        {
            min = Math.min(min,prices[i]);  //cp
            max = Math.max(max,prices[i]-min); //profit..
        }
        return max;
    }
}
