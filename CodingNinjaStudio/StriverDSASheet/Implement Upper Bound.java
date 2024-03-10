import java.util.*;
public class Solution {
    public static int upperBound(int []arr, int x, int n){
        // Write your code here.


        int low=0;
        int high=n-1;
        int ans=0;
        boolean update=false;

        while(low<=high)
        {
            int mid=low + (high-low)/2;
            
            //maybe an answer
            if(arr[mid]>x)
            {
                ans=mid;
                //for the leftmost element greater than x..
                high=mid-1;
                update=true;
            }
            else
            {
                low=mid+1;
            }
        }

        if(update==false)
        {
            return n;
        }

        return ans;

        // if(low>high)
        // {
        //     return high+1;
        // }
        // return n;

        // int low=0;
        // int high=n-1;
        // int ans=0;

        // while(low<=high)
        // {
        //     int mid=low + (high-low)/2;
        //     if(arr[mid]==x){
        //         //now i have the index where i have found x..
        //         //now traverse from this index and check the greater value index
        //         int i;
        //         for(i=mid+1;i<n;i++)
        //         {
        //             if(arr[i]>x)
        //             {
        //                 return i;
        //             }
        //         }
        //         return n;

        //     }
        //     if(arr[mid]<x)
        //     {
        //         low=mid+1;
        //     }
        //     else
        //     {
        //         ans=mid+1;
        //         high=mid-1;
        //     }
        // }

        // return ans;

        // if(low>high)
        // {
        //     return high+1;
        // }
        // return n;


        //brute force approach
        // int i;
        // for(i=0;i<n;i++)
        // {
        //     if(arr[i]>x)
        //     {
        //         return i;
        //     }
        // }
        // return n;
    }
}
