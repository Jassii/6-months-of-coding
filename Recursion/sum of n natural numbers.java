import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//Enter the number..
        
        //print sum of first n natural numbers..
        printSum(1,n,0);
	}
	public static void printSum(int i,int n,int sum)
	{
    //base condition has to be there inorder to avoid stack overflow..
	    if(i==n)//when the iteration number has reaced to the n value..
	    {
        //simply add the last number, print the sum and return the control...
	        sum = sum + i;
	        System.out.println("Sum of n natural numbers is "+sum);
	        return;
	    }
    //first take the sum.
	    sum = sum + i;
    //call the same function with its modified parameters..
	    printSum(i+1,n,sum);
	}
}
