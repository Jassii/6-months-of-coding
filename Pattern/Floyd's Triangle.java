// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15

import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int i,j,count=1;
	    int n = sc.nextInt();
	    
	    for(i=1;i<=n;i++)
	    {
	        for(j=1;j<=i;j++)
	        {
	            System.out.print(count+" ");
	            count++;
	        }
	       System.out.println();
	    }
	}
}
