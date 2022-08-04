import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//Enter the number..
        
        //print factorial of a number n..
        int fact = printFactorial(n); //this function will return the factorial of the number..
        System.out.println("The factorial of the above number is "+fact);
	}
	public static int printFactorial(int n)
	{
	    if(n==0 || n==1)//if value of n is 0 or 1..
	    {
	        return 1; //simply return 1.
	    }
	    return n*printFactorial(n-1); //rest inorder to find the factorial of a number..(recursive function)
	}
}
