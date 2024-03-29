class Solution:
    def maxProfit(self, prices: List[int]) -> int:

        #aaj isse khareed kr,, isse pehle jo minimum price hoga,,usse profit nikal kr..max profit nikalne ka try krna
        maxP=0
        minPrice=prices[0]
        for i in range(len(prices)):
            minPrice = min(minPrice,prices[i])   #mainitaining the min price..
            maxP = max(maxP,prices[i]-minPrice)   #calculating the profit and taking max profit..
        return maxP    

        # maxP=0
        # for i in range(len(prices)):
        #     cp = prices[i]
        #     found = False
        #     for j in range(i+1,len(prices)):
        #         #greater element from the i'th index
        #         if prices[j]>cp:
        #             found = True
        #             dif = prices[j]-cp
        #             maxP = max(dif,maxP) #it will store the max value
            
        #     #but suppose no greater value is found
        #     # if found==False:
        # return maxP    
