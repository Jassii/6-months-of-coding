class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        k=0
        for i in range(len(nums)):
            if nums[i]!=0:
                nums[k]=nums[i]
                k=k+1
        
        for k in range(k,len(nums)):
            nums[k]=0
