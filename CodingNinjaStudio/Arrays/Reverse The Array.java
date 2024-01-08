import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        // Write your code here.

        //two pointer approach.
        int s=m+1;
        int l=arr.size()-1;
        while(s<=l)
        {
            int temp = arr.get(s);
            arr.set(s,arr.get(l));
            arr.set(l,temp);
            s++;
            l--;
        }
        return;
    }
}
