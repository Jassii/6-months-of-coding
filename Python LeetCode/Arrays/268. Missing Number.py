class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        
        #beats 94%.
        #we can also use xor method
        ans=0
        for i in range(0,len(nums)+1):
            ans = ans^i

        for num in nums:
            ans = ans^num

        return ans        

        #another approach which beats 77%
        # sum=0
        # for i in range(0,len(nums)+1):
        #     sum = sum + i

        # for num in nums:
        #     sum = sum - num

        # return sum        

        #beats only 13%
        #one method or brute force approach
        # for i in range(0,len(nums)+1):
        #     if i not in nums:
        #         return i
