class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        index=-1
        
        #calculate the left sum
        lsum=0
        for i in range(0,len(nums)):
            lsum = lsum + nums[i]
        
        #traverse from the right and maintain its sum
        rsum=0
        for i in range(len(nums)-1,-1,-1):
            lsum = lsum-nums[i]
            if lsum==rsum:
                index = i
            rsum += nums[i]    
        return index
