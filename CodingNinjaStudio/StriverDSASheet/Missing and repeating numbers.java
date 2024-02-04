import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n)
    {
        int ans[] = new int[2];


        //one more approach
        int count[] = new int[n+1];
        int missing = -1;
        int repeat = -1;
        int i;
        for(i=0;i<n;i++)
        {
            count[arr.get(i)]++;
        }
        for(i=1;i<=n;i++)
        {
            if(count[i]==2)
            {
                repeat=i;
            }
            else if(count[i]==0)
            {
                missing=i;
            }
        }
        ans[0]=missing;
        ans[1]=repeat;
        return ans;


        //edge case
        // if(n==0)
        // {
        //     return ans;
        // }

        // //brute force approach
        // Set<Integer> set = new HashSet<>();
        // int i;
        
        // //for repeating number
        // for(i=0;i<n;i++)
        // {
        //     if(!set.contains(arr.get(i)))
        //     {
        //         set.add(arr.get(i));
        //     }
        //     else
        //     {
        //         ans[1] = arr.get(i);
        //         break;
        //     }
        // }

        // //for missing number
        // for(i=1;i<=n;i++)
        // {
        //     if(!arr.contains(i))
        //     {
        //         ans[0] = i;
        //         break;
        //     }
        // }
        // return ans;
    }
}
