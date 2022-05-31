import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
	public static ArrayList<ArrayList<Long>> printPascal(int n) 
    {
        // Write your code here.
        ArrayList<ArrayList<Long>> res = new ArrayList<ArrayList<Long>>();
        int i,j;
        //outer loop is for the number of rows..
        
        for(i=0;i<n;i++)
        {
            ArrayList<Long> lis = new ArrayList<>();
            //now for the columns..
            for(j=0;j<=i;j++)
            {
                //for 0th index and the last index, element is 1..
                if(j==0 || j==i)
                {
                    lis.add((long)1);
                }
                else//then in rest of the cases..
                {
                    long sum = res.get(i-1).get(j) + res.get(i-1).get(j-1);
                    lis.add(sum);
                }
            }
            res.add(lis);
        }
        return res;
	}
}
