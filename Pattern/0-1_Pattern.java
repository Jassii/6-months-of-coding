// 0-1 Pattern


// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
// 1 0 1 0 1

import java.util.*;
class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int i,j,k=1;
	    
    
    ///////////////////////////////////////////My waayyy//////////////////////
	    //outer loop is for rows.
	    for(i=1;i<=n;i++)
	    {
	        //for odd row number..
	        if(i%2!=0)
	        {
	            k=1;
	        }
	        else
	        {
	            k=0;
	        }
	        
	        //now inner loop will decide the number of elements in each row.
	        //number of elements is same as the row number..
	        for(j=1;j<=i;j++)
	        {
	            System.out.print(k+" ");
	            if(k==0)
	            {
	                k=1;
	            }
	            else
	            {
	                k=0;
	            }
	        }
	        System.out.println();
	    }
    
    //verrrrrry simmpleeeeeee waaaay.......
    for(i=1;i<=n;i++)
	   {
	       for(j=1;j<=i;j++)
	       {
	           //sum of i and j is even....(then print 1)
	           if((i+j)%2==0) 
	           {
	               System.out.print(1+" ");
	           }
	           else //else print 0..
	           {
	               System.out.print(0+" ");
	           }
	       }
	       System.out.println();
	   }
	}
}













