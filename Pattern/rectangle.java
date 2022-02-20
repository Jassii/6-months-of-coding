import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
    
//Rectangle Pattern.
//     * * * *
//     * * * *
//     * * * *
//     * * * *
//     * * * *			
	    Scanner sc = new Scanner(System.in);
		    


	    //different number of rows and different number of columns..
	     //you can take rows and columns input from the user..
	     int r = sc.nextInt();
	     int c = sc.nextInt();
	    
	    int i,j;
	    for(i=0;i<r;i++)
	    {
	        for(j=0;j<c;j++)
	        {
	            System.out.print("* ");
	        }
	        System.out.println(); //for changing line
	    }
	}
}
