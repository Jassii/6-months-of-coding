import java.io.*;
import java.util.* ;

import com.sun.jndi.url.rmi.rmiURLContext;


public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.

        //optimized appproach
        
        
        //brute force approach
        int ans=-1;
        Set<Integer> set = new HashSet<>();
        int i;
        for(i=0;i<n;i++)
        {
            if(!set.contains(arr.get(i)))
            {
                set.add(arr.get(i));
            }
            else
            {
                ans=arr.get(i);
                break;
            }
        }
        return ans;
    }
}
