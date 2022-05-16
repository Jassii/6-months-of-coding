// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		// looping through all testcases
		while(testcases-- > 0){
		    int n=Integer.parseInt(br.readLine());
		    String line1 = br.readLine();
		    String line2 = br.readLine();
		    String[] a1 = line1.trim().split("\\s+");
		    String[] b1 = line2.trim().split("\\s+");
		    int a[]=new int[n];
		    int b[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=Integer.parseInt(a1[i]);
		        b[i]=Integer.parseInt(b1[i]);
		    }
		    int qsz = Integer.parseInt(br.readLine());
		    int q[]=new int[qsz];
		    for(int i=0;i<qsz;i++)
		    {
		        q[i]=Integer.parseInt(br.readLine());
		    }
		    GFG ob=new GFG();
		    int ans[]=ob.find(a,b,q);
		    for(int i=0;i<qsz;i++)
		    System.out.println(ans[i]);
		    
		}
	}
}
// } Driver Code Ends


//User function Template for Java


class GFG
{
    public static int[] find(int a[],int b[],int q[])
    {
        int res[] = new int[q.length];
        int k=0;
        int i,j;
        for(i=0;i<q.length;i++)
        {
            int index = q[i];
            
            //value present in the array a[]
            int value = a[index];
            //now finding the count of the elements smaller than "value"
            //in the array b..
            int count=0;
            for(j=0;j<b.length;j++)
            {
                if(b[j]<=value)  //read question carefully(less than or equal to)
                {
                    count++;
                }
            }
            if(k<q.length)
            {
                res[k]=count;
                k++;
            }
        }
        return res;
    }
}
