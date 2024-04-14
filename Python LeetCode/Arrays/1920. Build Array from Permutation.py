class Solution:
    def buildArray(self, nums: List[int]) -> List[int]:
        n = len(nums)  #length of the nums array
        
        #initialize an array for size n, assigning value 0 at each index
        # ans = [0]*n
        ans=[]
        
        #traverse an array
        for i in range(0,n):
            # ans[i]=nums[nums[i]]
            ans.append(nums[nums[i]])
          
        return ans    
