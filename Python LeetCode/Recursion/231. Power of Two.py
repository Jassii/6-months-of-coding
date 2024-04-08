class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
      #one more method
        # return n>0 and (n&(n-1))==0

      #another method
        value = self.check(n,0)
        return value
        
    def check(self,n:int,x:int):
        #if the power of 2 becomes greater than the given number
        if(2**x < n):
            return self.check(n,x+1)
        else:
            return 2**x==n        
