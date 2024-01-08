import java.util.ArrayList;

public class Solution 
{
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) 
    {
        // Write your code here.
        k = k%arr.size();
        //rotate the array to the left by 'k' steps
        while(k>0)
        {
            int first = arr.get(0);
            int i;
            for(i=1;i<arr.size();i++)
            {
                arr.set(i-1,arr.get(i));
            }
            //at last set the last value of the array as the first value
            arr.set(arr.size()-1,first);
            k--;
        }
        return arr;
    }
}
