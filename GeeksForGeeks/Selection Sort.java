//{ Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n]; 
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
		
			Solution obj = new Solution();
			obj.selectionSort(arr, n);
			
			for(int i=0;i<n;i++)
		    	System.out.print(arr[i]+" ");
		    System.out.println();
			t--;
		}
		
	}
}

// } Driver Code Ends


class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        
        int index=-1; //this will store the index of the minimum value..
        
        int min = Integer.MAX_VALUE;
        for(int j=i;j<arr.length;j++)
        {
            if(arr[j]<min)
            {
                min = arr[j]; //update the value of the minimum.. 
                index = j; //store the min value index position..
            }
        }
        return index;//return minimum value index..
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    int i,j;
	    
	    for(i=0;i<n;i++)
	    {
	        int minValueIndex=-1;
	        minValueIndex = select(arr,i); //min value index..
	        //now its time to swap the values..
	        int temp = arr[i];
	        arr[i] = arr[minValueIndex];
	        arr[minValueIndex] = temp;
	    }
	}
}
