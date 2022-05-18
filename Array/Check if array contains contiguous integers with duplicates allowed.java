// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class GFG {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    
		    Solution obj = new Solution();
		    boolean res = obj.areElementsContiguous(arr, sizeOfArray);
		    if(res)
		        System.out.println("Yes");
		    else
		        System.out.println("No");
		}
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    // Function for finding maximum and value pair
    public static boolean areElementsContiguous (int arr[], int n) 
    {
        //Complete the function
        List<Integer> list = new ArrayList<>();
        int i;
        for(i=0;i<n;i++)
        {
            if(!list.contains(arr[i]))
            {
                list.add(arr[i]);
            }
        }
        
        //now as i have the list without the duplicates..
        //sort the list.
        Collections.sort(list);
        
        //now list is sorted..now simply check if the difference between the
        //adjacent elements is greater than 1 or not.
        for(i=1;i<list.size();i++)
        {
            int dif =Math.abs(list.get(i)-list.get(i-1)); //for precaution..
            if(dif>1)
            {
                return false;
            }
        }
        return true;
    }
}
