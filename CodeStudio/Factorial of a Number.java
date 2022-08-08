//program to calculate the factorial of the large number....

import java.math.BigInteger;
public class Solution 
{
	public static void factorial(int n) 
    {
		// Write your code here
        System.out.println(fact(n));
	}
    public static BigInteger fact(int n)
    {
        BigInteger f = new BigInteger("1");
        int i;
        for(i=2;i<=n;i++)
        {
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
}
