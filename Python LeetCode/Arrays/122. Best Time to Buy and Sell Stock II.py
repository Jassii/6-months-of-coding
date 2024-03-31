class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit=0
        #here we are simply checking if the current price is greater than the previous price
        #if yes, there is a profit..take out the sum..
        for i in range(1,len(prices)):
            if prices[i]>prices[i-1]:
                profit += (prices[i] - prices[i-1])  
        return profit        
