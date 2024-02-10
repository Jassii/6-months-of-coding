import java.util.*;
public class Solution 
{
	public static long reverseBits(long n) 
	{
		long ans=0;
		int i;
    //traversing till 32, as the number is 32bit unsigned integer
		for(i=1;i<=32;i++)
		{
			//left shift ans as we are trying to insert at the last position first
			ans = ans<<1;
			
			//finding the last digit of the number and pushing that number at the 
			//last position of the ans..
			ans = ans | (n&1);

			//right shift n 
			n = n>>1;
		}
		return ans;
	}
}
