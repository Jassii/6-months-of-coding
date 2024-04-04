class Solution:
    def myPow(self, x: float, n: int) -> float:   
        #good recursive approach 
        if(n==0):
            return 1
        elif (n<0):
            return 1/(x*self.myPow(x,-n-1))   #-n is done because n is already -ve, making it +ve.
        elif (n%2==0):   #if n is an even number or very huge, will also help in reducing the num
            a = self.myPow(x,n//2)
            return a*a
        return x * self.myPow(x,n-1)  

        #brute force approach
        # return x**n
