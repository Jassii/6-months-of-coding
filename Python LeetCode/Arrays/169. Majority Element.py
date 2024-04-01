class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        
        #optimized approach================================================================
        n = len(nums)
        #sort the array
        nums.sort()

        #return the middle element
        return nums[n//2]

        #brute force approach===============================================================
        #for this we have to take a dictionary
        # n = len(nums)
        # d = {}  #value,freq
        # for i in range(len(nums)):
        #     if nums[i] in d:
        #         d[nums[i]] = d.get(nums[i])+1
        #     else:
        #         d[nums[i]] = 1    

        # #traverse the dictionary
        # for key,value in d.items():
        #     if value>(n/2):
        #         return key
        # return 0             
