class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        k=k%len(nums)
        
        self.reverse(nums,0,len(nums)-1)
        self.reverse(nums,0,k-1)
        self.reverse(nums,k,len(nums)-1)

    def reverse(self,nums,i,j):
        while(i<j):
            temp=nums[i]
            nums[i]=nums[j]
            nums[j]=temp
            i+=1
            j-=1    

        #TLE
        # k=k%len(nums)
        # while(k>0):
        #     last=nums[len(nums)-1]
        #     for i in range(len(nums)-1,0,-1):
        #         nums[i]=nums[i-1]

        #     nums[0]=last
        #     k-=1
