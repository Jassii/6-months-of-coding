class Solution(object):
    def targetIndices(self, nums, target):
        #first sort the array
        nums.sort()

        #first index and the last index of the target integer in the array
        first = self.leftSearch(nums,target)
        second = self.rightSearch(nums,target)

        #result array
        result=[]

        #target is not found
        if(first==-1 and second==-1):
            return result
        
        #from first till second indexes
        while(first<=second):
            result.append(first)
            first+=1
        return result

    def leftSearch(self,nums,target):
        s=0
        pos=-1
        e=len(nums)-1
        while(s<=e):
            m=s+(e-s)/2
            if(nums[m]==target):
                pos=m
                e=m-1
            elif(target<nums[m]):
                e=m-1    
            else:
                s=m+1
        return pos

    def rightSearch(self,nums,target):
        s=0
        pos=-1
        e=len(nums)-1
        while(s<=e):
            m=s+(e-s)/2
            if(nums[m]==target):
                pos=m
                s=m+1
            elif(target<nums[m]):
                e=m-1    
            else:
                s=m+1
        return pos               
