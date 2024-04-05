class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        #using recursion
        result = []
        n = len(nums)
        temp = []
        self.helper(result,temp,0,nums)
        return result

    def helper(self,result,temp,start,nums):
        if(start==len(nums)):
            result.append(list(temp))
            return

        #recursive case
        #include the current element
        temp.append(nums[start])
        self.helper(result,temp,start+1,nums)

        #backtracking step
        temp.pop()

        #choice 2: exclude the current element
        self.helper(result,temp,start+1,nums)         
