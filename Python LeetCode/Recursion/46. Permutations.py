class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        result = [] #result list
        
        ds = []  #for every index, list will be maintained..
        freq = [0]*len(nums)
        
        self.helper(nums,result,ds,freq)
        return result

    def helper(self,nums,result,ds,freq):
        #base case
        if(len(ds)==len(nums)):
            result.append(list(ds))
            return

        for i in range(0,len(nums)):
            #if that value is not taken then proceed
            if(freq[i] == False):
                freq[i]=True  #occupied
                ds.append(nums[i])
                self.helper(nums,result,ds,freq)
                ds.pop() #remove the last index value
                freq[i]=False
