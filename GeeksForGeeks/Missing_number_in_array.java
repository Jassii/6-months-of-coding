//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] array = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                array[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            System.out.println(sln.missingNumber(array, n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java


//you can take the sum of the first n natural numbers and later subtract each number from the sum...last remaining sum value
//will be the answer..

class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
        int i,sum=0;
      //calculating the sum
        for(i=1;i<=n;i++)
        {
            sum = sum + i;
        }
       //subtracting each number one by one 
        for(i=0;i<n-1;i++)
        {
            sum = sum - array[i];
        }
      //return the sum value (missing number)
        return sum;
    }
}
