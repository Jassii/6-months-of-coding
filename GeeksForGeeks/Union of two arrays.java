//User function Template for Java

class Solution
{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        HashSet<Integer> set = new HashSet<Integer>();
        int i;
        for(i=0;i<n;i++)
        {
            set.add(a[i]);
        }
        
        for(i=0;i<m;i++)
        {
            set.add(b[i]);
        }
        
        return set.size();
    }
}
