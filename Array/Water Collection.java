// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class GFG {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().maxWater(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    int maxWater(int arr[], int n) 
    {
        // code here
        int left[] = new int[n];  //left array.storing the heights
        //of the maximum building from the left..
        
        int i;
        left[0]=arr[0];
        
        int max=arr[0];
        for(i=1;i<n;i++)
        {
            max = Math.max(max,arr[i]);
            left[i] = max;
        }
        
        
        //now its time for the right array..
        int right[] = new int[n];
        max = arr[n-1];
        right[n-1] = arr[n-1];
        for(i=n-2;i>=0;i--)
        {
            max = Math.max(arr[i],max);
            right[i] = max;
        }
        
        
        //now we will be calculating the amount of water stored..
        int total=0;
        for(i=0;i<n;i++)
        {
            int l = left[i];
            int r = right[i];
            int min = Math.min(l,r); //water collected will be the minimum..
            total = total + min - arr[i]; //subtract it from the height..
        }
        return total;
    }
}
