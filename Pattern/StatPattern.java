//    *
//   ***
//  *****
// *******
// *******
//  *****
//   ***
//    *

import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int i,j;
        int n = sc.nextInt();
        
        //first focusing on the upper portion..
        for(i=1;i<=n;i++)
        {
            //first print the spaces..
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            
            //now print the stars..
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            
            for(j=2;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            
        }
            //now focusing on the lower portion..
            for(i=n;i>=1;i--)
            {
                //considering the spaces..
                for(j=1;j<=n-i;j++)
                {
                    System.out.print(" ");
                }
                //now print the stars..
                for(j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
                
                for(j=2;j<=i;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        
	}
}
