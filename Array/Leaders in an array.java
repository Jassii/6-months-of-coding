// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Array {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		
		while(t-->0){
		    
		    //input size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //inserting elements in the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    StringBuffer str = new StringBuffer();
		    ArrayList<Integer> res = new ArrayList<Integer>();
		  
		    //calling leaders() function
		    res = obj.leaders(arr, n);
		    
		    //appending result to a String
		    for(int i=0; i<res.size(); i++){
		        str.append(res.get(i)+" ");
		    }
		    
		    //printing the String
		    System.out.println(str);
		}
		
	}
}
// } Driver Code Ends


// Method 2 (Scan from right) 
// Scan all the elements from right to left in an array and keep track of maximum till now. When maximum changes its value, print it.
// Below image is a dry run of the above approach:


class Solution
{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n)
    {
        // Your code here
        ArrayList<Integer> res = new ArrayList<>();
        
        //suppose size of n is 0..
        if(n==0)
        {
            return res; //empty list..
        }
        res.add(arr[n-1]);//as we know that the last element will be the 
        //leader..
        
        int max = arr[n-1];
        //will compare with the max..
        //if greater than max..will be added in the list..and max updated..
        
        //will go from the right side..(simpler)
        int i;
        for(i=n-2;i>=0;i--)
        {
            if(arr[i]>=max)
            {
                res.add(arr[i]);
                max = arr[i];
            }
        }
        
        
        //after this i have to reverse the list..as
        //I have input from the right side..
        Collections.reverse(res);
        
        return res;
    }
        //basic approach..(not good enough)..(time limit exceeded..)
    //     int i,j;
        
    //     for(i=0;i<n-1;i++)
    //     {
    //         boolean end=true;
    //         for(j=i+1;j<n;j++)
    //         {
    //             if(arr[i]<arr[j])
    //             {
    //                 end=false;
    //                 break;
    //             }
    //         }
    //         //means that j has gone to the last index position..
    //         if(end==true)
    //         {
    //             res.add(arr[i]);
    //         }
    //     }
    //     //now for the last element..
    //     res.add(arr[n-1]);
        
    //     return res;
    // }
}
