class Solution:
    def check(self, nums: List[int]) -> bool:
        
        #check if array is sorted or not
        issort=self.isSort(nums)
        if(issort==True):
            return True

        #means that the array is not sorted..not perform certain operations.
        #play with nums
        count=1 #which will be traversed till len(nums)
        while(count<=len(nums)):
            first=nums[0]
            #left shift values 
            for i in range(0,len(nums)-1):
                nums[i]=nums[i+1]

            #now put first stored entry at the last
            nums[len(nums)-1] = first

            # print(nums)

            #check if the nums is sorted or not  
            issort = self.isSort(nums)
            if(issort==True):
                print("yes its sorted")
                return True
            
            count+=1 

        return False       

    def isSort(self,nums) -> bool:
        for i in range(0,len(nums)-1):
            if(nums[i]>nums[i+1]):
                return False

        return True

# ============================================================================
        # breaks=0
        # for i in range(len(nums)-2,-1,-1):
        #     if(nums[i]>nums[i+1]):
        #         breaks+=1

        # if(nums[0]<nums[len(nums)-1]):
        #     breaks+=1

        # if(breaks>1):
        #     return False
        # return True            
# ============================================================================

        # pivot=-1
        # #traverse from the back
        # for i in range(len(nums)-2,-1,-1):
        #     if(nums[i]>nums[i+1]):
        #         pivot=i
        #         break

        # #no such deviation is there
        # if(pivot==-1):
        #     return True 

        # if(pivot==0):
        #     if(nums[0]<nums[len(nums)-1]):
        #         return False    


        # #till pivot it should be sorted..and even after that it should be sorted..    
        # for i in range(0,pivot):
        #     if(nums[i]>nums[i+1]):
        #         return False

        # #check for another side as well
        # for i in range(pivot+1,len(nums)-1):
        #     if(nums[i]>nums[i+1]):
        #         return False  

        # return True        
