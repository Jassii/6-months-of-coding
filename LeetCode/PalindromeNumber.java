// Given an integer x, return true if x is palindrome integer.

// An integer is a palindrome when it reads the same backward as forward.

// For example, 121 is a palindrome while 123 is not.
 

// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// Example 2:

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
// Example 3:

// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

class Solution 
{
    public boolean isPalindrome(int x) 
    {
        String num = Integer.toString(x); //this will convert x into string..
        StringBuilder rev = new StringBuilder(); //creating a StringBuilder
        rev = rev.append(num); //simply putting the string in rev..
        rev.reverse();  //reversing the string..as StringBuilder has a reverse function.
        String r = rev.toString(); //converting the StringBuilder into String..
        
        if(r.equals(num)) //checking of the original string is same as the reversed string.
        {
            return true; //return true..if it is same.
        }
        return false; //else return false.
      
      /////////////////////////////////////////////// EFFICIENT WAY/////////////////////////////
      //if number is negative..
        if(x<0)
        {
            return false;
        }
        
        int n=x;
        
        int num=0;
        while(n>0)
        {
            int l = n%10; //last digit..
            num = num*10 + l;
            n = n/10; //reduce the number..
        }
        return (num==x);
    }
}
