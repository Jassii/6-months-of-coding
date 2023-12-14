import java.util.* ;

public class Solution {

    public static boolean checkPalindrome(long N) 
    {
        // Write your code here.
        
        //first process is to convert N into binary string
        String str = Long.toBinaryString(N);  //function to convert Long number to binary representation (in string) directly..

        return isPalindrome(str,0,str.length()-1);
    }

    public static boolean isPalindrome(String str,int i,int j)
    {
        //base case
        if(i>j)
        {
            return true;
        }
        //if the character is not same..
        if(str.charAt(i)!=str.charAt(j))
        {
            return false;
        }
        else
        {
            i++;
            j--;
            return isPalindrome(str, i, j);
        }
    } 
}
