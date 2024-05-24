class Solution(object):
    def mySqrt(self, x):
      
        #brute force approach
        # return int(x**0.5)

        #using binary search algorithm
        return self.getSqrt(x,0,x)

    def getSqrt(self,x,start,end):
        ans=-1
        while(start<=end):
            mid=start+(end-start)/2
            if(mid**2==x):
                return mid
            elif(mid**2>x):
                end=mid-1
            else:
                ans=mid
                start=mid+1   
        return ans             
