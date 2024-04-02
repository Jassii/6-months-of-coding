class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        
        #optimized approach -> O(n)
        

        # result = [0]*len(nums)        
        # print(result)

        #square the elements of the array
        # for i in range(0,len(nums)):
        #     nums[i] = nums[i]**2
        # # print(nums)
        # #now its time to sort the array..but in O(n)
        # i=0
        # j=len(nums)-1
        # k=len(nums)-1

        # while(i<=j):
        #     if(nums[j]>=nums[i]):
        #         result[k]=nums[j]
        #         j-=1
        #         k-=1
        #     else:
        #         result[k]=nums[i]
        #         i+=1
        #         k-=1
        # return result            


                 

        #brute force approach -> O(nlogn)+n
        for i in range(0,len(nums)):
            nums[i] = nums[i]*nums[i]
        nums.sort()
        return nums    
