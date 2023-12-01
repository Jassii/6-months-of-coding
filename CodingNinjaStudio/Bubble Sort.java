import java.util.* ;
import java.io.*; 

public class Solution {
    
    public static void bubbleSort(int[] arr, int n) 
    {   
        // int i,j;
        // for(i=0;i<n-1;i++)
        // {
        //     for(j=0;j<n-i-1;j++)  //doing -1 because inside the loop where
        //     //we comaring the value with the next value..(j+1)
        //     {
        //         if(arr[j]>arr[j+1])
        //         {
        //             //swap the values..
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }


        //Optimized way..
        int i,j;
        for(i=0;i<n-1;i++)
        {
            boolean swap = false;
            
            //there can be a chance, that th array becomes sorted in the secon
            //third iteration...any iteration but before the (n-1) round..
            //then in that case, there will no swap (between any numbers)..
            //for each round.
            
            for(j=0;j<n-i-1;j++)  //doing -1 because inside the loop where
            //we comaring the value with the next value..(j+1)
            {
                if(arr[j]>arr[j+1])
                {
                    //swap the values..
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    //if swap is happening
                    swap = true;
                }
            }
            //just simple check if no swap then simply break the loop
            if(swap==false)
            {
                break;
            }
        }
    }

}
