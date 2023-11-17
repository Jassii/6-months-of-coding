public class Solution 
{
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    
    //remember the below operation only works when the number is repeated twice.
    public int singleNumber(final int[] A) 
    {
        int ans=0;
        int i;
        for(i=0;i<A.length;i++)
        {
            ans = ans ^ A[i];  //simple XOR 
        }
        return ans;
    }
}
