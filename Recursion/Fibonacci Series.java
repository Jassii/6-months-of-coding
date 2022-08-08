import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//Enter the number..
        
        //print the fibonacci series till the nth term..
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        printFibonacci(a,b,n-2);  //doing n-2 because two of the elements we have already printed...
	}
	public static void printFibonacci(int a,int b,int n)
	{   
	    if(n==0)
	    {
	        return;
	    }
	    int sum = a+b;
	    System.out.println(sum);
        printFibonacci(b,sum,n-1);
	}   
}
