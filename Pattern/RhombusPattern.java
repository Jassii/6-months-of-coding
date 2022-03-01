//     *****
//    *****
//   *****
//  *****
// *****


import java.util.*;
class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int i,j;
	    
	    for(i=1;i<=n;i++)
	    {
	        //now its time to print the spaces..(don't forget to use equal operator..)
	        for(j=1;j<=n-i;j++)
	        {
	            System.out.print(" ");
	        }
	        
	        //now its time to print the stars..
	        for(j=1;j<=n;j++)
	        {
	            System.out.print("*");
	        }
	        //change the line..
	        System.out.println();
	    }
	}
}
