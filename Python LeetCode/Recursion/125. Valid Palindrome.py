class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = s.lower() #conver the string to lower case
        res="" #empty string

        #traverse the string
        for c in s:
            if (c>='a' and c<='z') or (c>='0' and c<='9'):
                res = res + c

        #now we have the string with only alphanumeric characters i.e. res

        #reverse the string
        rev = res[::-1]

        if(res==rev):
            return True

        return False            
