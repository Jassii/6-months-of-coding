//check prime numbers till the number n...

import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    boolean isPrime[] = sieveOfErastosthenes(20);
	    int i;
	    for(i=0;i<=20;i++)
	    {
	        System.out.println(i+" "+isPrime[i]);
	    }
	}
	static boolean[] sieveOfErastosthenes(int n)
	{
	    boolean isPrime[] = new boolean[n+1]; //taken n+1 because including 0 as well
	    
	    //fill the above array with true
	    Arrays.fill(isPrime,true);
	    isPrime[0] = false;
	    isPrime[1] = false;
	    int i,j;
	    for(i=2;i*i<=n;i++) // [ 2->sqrt(n) ]
	    {
	        for(j=2*i;j<=n;j=j+i)  //multiple of i..
	        {
	            isPrime[j] = false;
	        }
	    }
	    return isPrime;
	}
}
