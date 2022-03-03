//   *   *  
//  * * * * 
// *   *   *


import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i,j;
		int n = sc.nextInt();
		
    //As you can see that only three rows are there..so (1 to 3)
		for(i=1;i<=3;i++)
		{
      //total of n columns are there..
		    for(j=1;j<=n;j++)
		    {
          //just taken out the index positions of the stars...
		        if(((i+j)%4==0) || ((i==2) && (j%4==0)))
		        {
		            System.out.print("*");
		        }
          //rest of the position will have spaces..
		        else
		        {
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}
	}
}
