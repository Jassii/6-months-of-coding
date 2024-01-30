import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        //DUTCH NATIONAL FLAG ALGORITHM
        // [0...low-1] -> 0
        // [low...mid-1] -> 1
        // [high+1..n-1] -> 2



        int low=0;
        int mid=0;
        int high=arr.length-1;

        //we will be playing with the high index
        while(mid<=high)
        {
            //if the value at the mid index is 0
            if(arr[mid]==0)
            {
                //swap it with low element..
                //1 ko aage utha kr le aaye..hence mid+1
                swap(arr,mid,low);
                low++;
                mid++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else
            {
                //swap it with high element 
                swap(arr,mid,high);
                high--;
            }
        }
    }
    public static void swap(int arr[],int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
