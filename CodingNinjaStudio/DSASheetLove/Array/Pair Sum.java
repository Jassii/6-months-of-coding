import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static int pairSum(int arr[], int n, int target) 
    {
        //optimized approach
        int l=0;
        int e=n-1;
        int count=0;
        while(l<e)
        {
            int value = arr[l]+arr[e];
            if(value<target)
            {
                l++;
            }
            else if(value>target)
            {
                e--;
            }
            else
            {
                count++;
                l++;
                e--;
            }
        }
        if(count==0)
        {
            return -1;
        }
        return count;


        //brute force approach..
        //    int i,j,count=0;
        //    for(i=0;i<n-1;i++)
        //    {
        //        for(j=i+1;j<n;j++)
        //        {
        //            if(arr[i]+arr[j]==target)
        //            {
        //                count++;
        //            }
        //        }
        //    } 
        //    if(count==0)
        //    {
        //        return -1;
        //    }
        //    return count;
    }   
}
