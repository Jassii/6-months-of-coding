class Solution(object):
    def search(self, nums, target):
        n=len(nums)

        print("get the pivot index")
        #get the pivot index
        pivot = self.getPivot(nums,n)

        print("pivot index value is ",pivot)

        if(target>=nums[pivot] and target<=nums[n-1]):
            return self.binarySearch(nums,target,pivot,n-1)
        else:
            return self.binarySearch(nums,target,0,pivot-1)    

            
    #using binary search in order to find the index of the target
    def binarySearch(self,nums,target,start,end):
        print("in binary search function")
        while(start<=end):
            mid=start+(end-start)/2
            if(nums[mid]==target):
                return mid
            elif(target<nums[mid]):
                end=mid-1
            else:
                start=mid+1

        return -1                
    
    #using binary search inorder to find pivot index of the array
    def getPivot(self,nums,n):
        print("in pivot function")
        start=0
        end=n-1
        while(start<end):
            mid=start+(end-start)/2
            if(nums[mid]>=nums[0]):
                start=mid+1
            else:
                end=mid   

        return start                         
