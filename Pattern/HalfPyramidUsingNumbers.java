import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int i,j;
	    int n = sc.nextInt();//input the number
	    
	    //outer loop is for number of rows..
	    for(i=1;i<=n;i++)
	    {
	        //number will depend upon the row number..
	        for(j=1;j<=i;j++)
	        {
	            System.out.print(i+" "); //print the i'th value....
	        }
	        System.out.println(); //change the line
	    }
	}
}
