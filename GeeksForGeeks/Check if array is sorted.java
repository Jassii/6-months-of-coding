//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            boolean ans = new Solution().arraySortedOrNot(arr, n);
            System.out.println(ans ? 1 : 0);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution 
{
    boolean arraySortedOrNot(int[] arr, int n) 
    {
        // code here
        
        //base case..
        //if the array contains zero or only 1 element..array is sorted.
        if(n==0 || n==1)
        {
            return true;
        }
        
        //now one more case..where we can check for the last two elements.
        
        if(arr[n-1]<arr[n-2])
        {
            return false;
        }
        //if it does not goes insdie the above if condition..then remove last two elements
        
        return arraySortedOrNot(arr,n-1);
    }
}
