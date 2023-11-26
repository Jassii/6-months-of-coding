import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    decimalNumber(n);
	}
	
	//below function converts binary representation to decimal number
	public static void decimalNumber(int n)
	{
	    int i=0;
	    int ans=0;
	    while(n!=0)
	    {
	        //pick the last bit..
	        int lbit = n%10; 
	        if(lbit!=0)
	        {
	            ans = ans + lbit*(int)Math.pow(2,i);
	        }
	        
	        i++;
	        n = n/10;
	    }
	    System.out.println("Decimal number is "+ans);
	}
}
