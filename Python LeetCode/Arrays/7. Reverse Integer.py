class Solution:
    def reverse(self, x: int) -> int:
        #check for negative
        neg=False
        if(x<0):
            neg=True
            x=x*-1  #make it positive

        #now reverse the intger(make sure that it remains in 32-bit signed integer)
        rev=0
        while(x>0):
            l = x%10
            rev = 10*rev + l
            #need to check one condition for every reverse value
            if(rev<-2**31 or rev>(2**31-1)):
                return 0
            x=x//10

        if(neg==True):
            rev = rev*-1
        return rev        
