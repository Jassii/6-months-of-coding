class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        #optimize approach
        freq = {} #taking a freq map
        count=0
        #traverse an array
        for i in range(0,len(nums)):
            if nums[i] not in freq:
                freq[nums[i]] = 1
            else:
                count+=freq[nums[i]] #pair is found
                freq[nums[i]] += 1
        return count       
      
        #brute force approach
        # count=0
        # n = len(nums)
        # for i in range(0,n):
        #     for j in range(i+1,n):
        #         if(nums[i]==nums[j]):
        #             count+=1
        # return count            
        
