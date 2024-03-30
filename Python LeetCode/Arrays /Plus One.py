class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        
        #we have to traverse from the back..
        for i in range(len(digits)-1,-1,-1):
            if(digits[i]<9):
                digits[i] = digits[i]+1
                return digits
        #now the numbers will be 9..untill you find number less than 9 or the loop is finished
            digits[i]=0 #make it to 0..

        #now suppose all the digits were 9, then loop is completed.
        #now simply add 1 at the starting digit..as rest of the digits will be 0.
        digits.insert(0,1)
        return digits    
