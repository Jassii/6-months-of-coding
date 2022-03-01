//     1 
//    1 2 
//   1 2 3 
//  1 2 3 4 
// 1 2 3 4 5 

import java.util.*;
class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int i,j;
	    
	    //outer loop is for rows..
	    for(i=1;i<=n;i++)
	    {
	        //now print the spaces..
	        for(j=1;j<=n-i;j++)
	        {
	            System.out.print(" ");
	        }
	        //now print the values with the spaces..
	        for(j=1;j<=i;j++)
	        {
	            System.out.print(j+" ");
	        }
	        System.out.println();
	    }
	}
}
