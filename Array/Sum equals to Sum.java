// { Driver Code Starts
//Initial Template for Java





import java.io.*;
import java.util.*;

class Array {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    int t=sc.nextInt(); //input testcases
	    
	    while(t-->0) //Loop until we exhaust all testcases
	    {
	        int n=sc.nextInt(); //Input size of array n
	        int arr[]=new int[n]; //Declaring the array
	        for(int i=0;i<n;i++)
	        {
	            int x=sc.nextInt();
	            arr[i]=x; //Assigning elements to array
	        }
	        
	        Solution ob=new Solution(); //object to call the function
	        System.out.println(ob.findPairs(arr,n)); //The functions you complete
	        
	    }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution
{ 
    public int findPairs(int arr[],int n) 
    { 
        //code here.
        
        //simple use of HashSet...
        Set<Integer> set = new HashSet<>();
        int i,j;
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                int sum = arr[i]+arr[j];
                if(!set.contains(sum))
                {
                    set.add(sum);
                }
                else
                {
                    return 1;
                }
            }
        }
        return 0;
    }
}
