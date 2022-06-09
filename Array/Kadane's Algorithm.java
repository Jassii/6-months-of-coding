// { Driver Code Starts
import java.io.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling maxSubarraySum() function
		    System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}

// } Driver Code Ends


class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n)
    {
        // Your code here
        
        //applying kadane's algorithm
        
        //as in the question it is written that it contains at least
        //one number..
        long curr_sum = (long)arr[0];
        long max_sum = (long)arr[0];
        
        int i;
        for(i=1;i<n;i++)
        {
            curr_sum = Math.max(arr[i],curr_sum+(long)arr[i]);
            max_sum = Math.max(curr_sum,max_sum);
        }
        return max_sum;
    }   
}
