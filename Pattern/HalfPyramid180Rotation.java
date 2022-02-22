import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
    
		int n = sc.nextInt(); //enter the number..
    
    ////////////////////////////////////////////ONE METHOD///////////////////////////////////////
		int i,j;
		//outer loop is just for the row..
		for(i=n;i>=1;i--)
		{
		    for(j=1;j<=n;j++)
		    {
		        //this will help in adding spaces..
		        if(j<i)
		        {
		            System.out.print(" ");
		        }
          //this will help in printing starts..
		        else
		        {
		            System.out.print("*");
		        }
		    }
      //change the line
		    System.out.println();
		}
    
    
    //////////////////////////////////////ANOTHER METHOD//////////////////////////////////////////
    int i,j,space;
    for(i=1;i<=n;i++)
		{
		    //now it is time to print the space..
		    for(space=1;space<=n-i;space++)
		    {
		        System.out.print(" ");
		    }
		    //now its time to print "*"
		    for(j=1;j<=i;j++)
		    {
		       System.out.print("*");
		    }
      //change the line
		    System.out.println();
		}
	}
}
