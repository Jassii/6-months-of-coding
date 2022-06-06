class Solution 
{
    public int maxProfit(int[] prices) 
    {
        // int max_profit=0;
        // int i,j;
        // for(i=0;i<prices.length-1;i++)
        // {
        //     //prices[i] tells about the cost value..
        //     int max = Integer.MIN_VALUE;
        //     for(j=i+1;j<prices.length;j++)
        //     {
        //         max = Math.max(max,prices[j]);
        //     }
        //     //max is nothing but the selling value..
        //     max_profit = Math.max(max_profit,max-prices[i]);
        // }
        // return max_profit;
        
        //Another method(optimal solution..)
        int max_profit = 0;
        int min = Integer.MAX_VALUE;
        int i;
        
        for(i=0;i<prices.length;i++)
        {
            min = Math.min(min,prices[i]);
            max_profit = Math.max(max_profit,prices[i]-min);
        }
        return max_profit;
    }
}
