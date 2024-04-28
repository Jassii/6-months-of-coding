class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        maxOne=0
        count=0
        for i in range(0,len(nums)):
            if(nums[i]==1):
                count+=1
            else: #when it is not equal to 1, check the maxOne and count=0
                maxOne = max(maxOne,count)
                count=0

        #when the loop has been traversed..
        maxOne = max(count,maxOne)

        return maxOne        
