//{ Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    for(int i=0;i<t;i++){
	        int n = Integer.parseInt(br.readLine());
	        String l = br.readLine();
    		String[] sarr = l.split(" ");
    		int[] arr = new int[sarr.length];
    		for(int i1=0;i1<arr.length;i1++){
    			arr[i1] = Integer.parseInt(sarr[i1]);
    		}
    		
            Solution obj = new Solution();
            
            int[] res = obj.twoRepeated(arr, n);
            System.out.println(res[0] + " " + res[1]);
	    }
	}
}
// } Driver Code Ends


//User function template for JAVA

class Solution
{
    //Function to find two repeated elements.
    public int[] twoRepeated(int arr[], int N)
    {
        // Your code here
        
        int rep[] = new int[2];    
        int i,j=0;
        
        for(i=0;i<N+2;i++)             1 2 1 3 4 3
                                            
                                          
        {
            int num = Math.abs(arr[i]);  
            
            if(arr[num]<0)
            {
                rep[j] = num;
                j++;
            }
            else
            {
                arr[num] = -arr[num];
            }
        }
        return rep;

  //using set approach
      
        // Set<Integer> set = new HashSet<Integer>();
        // int rep[] = new int[2];
        // int i,j=0;
        // for(i=0;i<N+2;i++)
        // {
        //     if(set.contains(arr[i])==false)
        //     {
        //         set.add(arr[i]);
        //     }
        //     else
        //     {
        //         rep[j] = arr[i];
        //         j++;
        //     }
        // }
        // return rep;
        

  //using hasmap  approach   
      
        // HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        // int rep[] = new int[2];
        // int i,j=0;
        // for(i=0;i<N+2;i++)
        // {
        //     if(map.containsKey(arr[i]))
        //     {
        //         map.put(arr[i],map.get(arr[i])+1);
        //         if(map.get(arr[i])>1)
        //         {
        //             rep[j] = arr[i];
        //             j++;
        //         }
        //     }
        //     else
        //         map.put(arr[i],1);
        // }
        // return rep;
    }
}
