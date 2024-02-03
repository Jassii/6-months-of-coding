import java.util.*;

public class Solution 
{
    public static List< List< Integer > > mergeOverlappingIntervals(int [][]arr)
    {
        //answer list   
        List<List<Integer>> ans = new ArrayList<>();

        //size of the array
        int n = arr.length;
        
        //base condition
        if(n==0)
        {
            return ans;
        }

        //sort the array based on the 0th index value
        Arrays.sort(arr,new Comparator<int[]>() 
        {
            public int compare(int a[],int b[])
            {
                return a[0]-b[0];
            }    
        });

        //traverse the array..
        int i;
        for(i=0;i<arr.length;i++)
        {
            //if the list is empty or no overlappng interval
            if(ans.isEmpty() || arr[i][0]>ans.get(ans.size()-1).get(1))
            {
                ans.add(Arrays.asList(arr[i][0],arr[i][1]));
            }
            //is an overlapping interval
            else
            {
                ans.get(ans.size()-1).set(1,Math.max(ans.get(ans.size()-1).get(1),arr[i][1]));
            }
        }
        return ans;
    }
}
