import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    //Hollow Rectangle Pattern.
      
      //****
      //*  *
      //*  *
      //*  *
      //****
	    
	    Scanner sc = new Scanner(System.in);
    
	    //different number of rows and different number of columns..
	     //you can take rows and columns input from the user..
	     int r = sc.nextInt();
	     int c = sc.nextInt();
	    
	    int i,j;
	    for(i=1;i<=r;i++)
	    {
	        for(j=1;j<=c;j++)
	        {
	            //stars are full on the first and last row.
	            if(i==1 || i==r)
	            {
	                System.out.print("*");
	            }
	            //stars are also full on the first and last column.
	            else if(j==1 || j==c)
	            {
	                System.out.print("*");
	            }
	            //remaining rows and columns simply print the space...
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
	}
}
