import java.util.*;
public class Solution 
{
    public static int subarraysWithSumK(int []a, int b) 
    {
        //optimized approach using HashMap
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int i;

        //count of the subarrays.
        int count=0;

        map.put(0,1);
        
        int xr=0;
        for(i=0;i<a.length;i++)
        {
            //taking out xor value
            xr=xr^a[i];
            
            //catch step..
            int x = xr^b; //if its value found in the map,,get its value..and get the
            //count
            if(map.containsKey(x))
            {
                count += map.get(x);
            }
            
            //maintain the xr value with its count in the map..(prefix xor)
            if(map.containsKey(xr))
            {
                map.put(xr,map.get(xr)+1);
            }
            else
            {
                map.put(xr,1);
            }   
        }

        return count;


        //better approach -> O(n^2)..
        // int i,j;
        // int count=0;
        // for(i=0;i<a.length;i++)
        // {
        //     int value=0;
        //     for(j=i;j<a.length;j++)
        //     {
        //         //here it has to be checked at each iteration, as it will be the 
        //         //subarray
        //         value = value^a[j];
        //         if(value==b)
        //         {
        //             count++;
        //         }
        //     }
        //     //check if the value matches with b
            
        // }
        // return count;
        
        
        //brute force approach  -> O(n^3)..
        //find all the subarrays and find out the xor of each subarrays
        //and check if its value matches with b or not..
        // int i,j;
        // int count=0;
        // for(i=0;i<a.length;i++)
        // {
        //     for(j=i;j<a.length;j++)
        //     {
        //         int k;
        //         int value=0;
        //         for(k=i;k<=j;k++)
        //         {
        //             value = value^a[k];
        //         }
        //         //check if the value matches with b
        //         if(value==b)
        //         {
        //             count++;
        //         }
        //     }
        // }
        // return count;
    }
}
