//{ Driver Code Starts
//Initial Template for Java

//User function Template for Java

class Solution
{
    public int[] mergeHeaps(int[] a, int[] b, int n, int m) 
    {
        // your code here
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int i;
        for(i=0;i<n;i++)
        {
            maxHeap.add(a[i]);
        }
        for(i=0;i<m;i++)
        {
            maxHeap.add(b[i]);
        }
        
        int arr[] = new int[n+m];
        for(i=0;i<(n+m);i++)
        {
            arr[i] = maxHeap.poll();
        }
        return arr;
    }
}
