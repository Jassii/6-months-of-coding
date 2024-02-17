import java.util.ArrayList;
public class Solution 
{
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) 
    {
        //optimized approach
        int i,j;
        int m=mat.size();
        int n=mat.get(0).size();
        for(i=0;i<m;i++)
        {
            //0th index value
            int zeroth = mat.get(i).get(0);
            //1st index value
            int last = mat.get(i).get(n-1);
            //now will check whether the target lies between the 0th and mth index position
            if(target>=zeroth && target<=last)
            {
                //select that row..
                ArrayList<Integer> arr = mat.get(i);
                
                //now find that target using binary search.
                int l=0;
                int h=arr.size()-1;
                while(l<=h)
                {
                    int mid = l+(h-l)/2;
                    if(arr.get(mid)==target)
                    {
                        return true;
                    }
                    else if(target<arr.get(mid))
                    {
                        h=mid-1;
                    }
                    else
                    {
                        l=mid+1;
                    }
                }
                return false;
            }
        }

        return false;





        //brute force approach..
        // int i,j;
        // for(i=0;i<mat.size();i++)
        // {
        //     for(j=0;j<mat.get(0).size();j++)
        //     {
        //         if(mat.get(i).get(j)==target)
        //         {
        //             return true;
        //         }
        //     }
        // }   
        // return false;
    }
}
