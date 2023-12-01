import java.util.* ;
import java.io.*; 

public class Solution {
    
    public static void bubbleSort(int[] arr, int n) 
    {   
        int i,j;
        for(i=0;i<n-1;i++)  //as the last element will be automatically at its correct position.
        {
            for(j=0;j<n-i-1;j++)  //doing -1 because inside the loop where
            //we comaring the value with the next value..(j+1)
            {
                if(arr[j]>arr[j+1])
                {
                    //swap the values..
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
