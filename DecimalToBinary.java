import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    binaryNumber(n);
	}
	
	public static void binaryNumber(int n)
	{
	    int ans = 0;
	    int i = 0;
	    while(n!=0)
	    {
	        int bit = n&1; //this will find the last bit of the number..
	       // ans = (int)(ans*Math.pow(10,i))+bit;
	       ans = (int)(bit*Math.pow(10,i))+ans;
	        n = n>>1; //dvide n by 1.
	        i++;
	    }
	    System.out.println("Answer is "+ans);
	}
}
