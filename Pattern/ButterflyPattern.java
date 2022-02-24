//     *      *
//     **    **
//     ***  ***
//     ********
//     ********     //ButterFly pattern
//     ***  ***
//     **    **
//     *      *

import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int i,j;
	    
      int n = sc.nextInt(); //enter the number.
	   
	   //First focusing on the "upper portion" of the pattern..
	   
	   //number of rows.
	   for(i=1;i<=n;i++)
	   {
	       //loop for printing "*" at the starting
	       for(j=1;j<=i;j++)
	       {
	           System.out.print("*");
	       }
	       
	       //now a loop will be used inorder to print the "spaces"...
	       for(j=1;j<=((2*n)-(2*i));j++)
	       {
	           System.out.print(" ");
	       }
	       
	       //loop for printing "*" at the end..
	       for(j=1;j<=i;j++)
	       {
	           System.out.print("*");
	       }
	       
	       System.out.println();
	   }
	   
	   
	   //Now focusing on the "lower portion" of the pattern..
	   
	   //remaing n rows has to be there.
	   for(i=n;i>=1;i--)
	   {
	       //now focusing on printing the starting "*"
	       for(j=1;j<=i;j++)
	       {
	           System.out.print("*");
	       }
	       
	       //now focusing on printing the spaces..
	       for(j=1;j<=((2*n)-(2*i));j++)
	       {
	           System.out.print(" ");
	       }
	       
	       //now printing the "*" at the end..
	       for(j=1;j<=i;j++)
	       {
	           System.out.print("*");
	       }
	       
	       System.out.println();
	       
	   }	   
	}
}
