import java.util.* ;
import java.io.*; 

public class Solution 
{
    public static void rearrange(int[] arr) 
    {

        //brute force approach..
        int countN=0;
        int countP=0;
        int i;
        //taking the count of negative and positive number
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                countN++;
            }
            else
            {
                countP++;
            }
        } 

        //either whole array is positive or negative
        if(countN==0 || countP==0)
        {
            return;
        }

        //created the array of their respective size
        int neg[] = new int[countN];
        int pos[] = new int[countP];
        int n=0,p=0;
        //again traversing the array and filling elements in the above two arrays
        for(i=0;i<arr.length;i++)
        {
            //negative element
            if(arr[i]<0)
            {
                neg[n] = arr[i];
                n++;
            }
            else
            {
                pos[p] = arr[i];
                p++;
            }
        }

        //alternatively assign the values to the original array 
        //starting from the negative array
        i=0;
        p=0;
        n=0;
        boolean sign=true;
        while(p<countP && n<countN)
        {
            if(sign==true)
            {
                arr[i]=neg[n];
                i++;
                n++;
                sign=false;
            }
            else
            {
                arr[i]=pos[p];
                i++;
                p++;
                sign=true;
            }
        }

        //there can be a chance that one array filling is left.
        //it can be any array..

        while(p<countP)
        {
            arr[i] = pos[p];
            i++;
            p++;
        }

        while(n<countN)
        {
            arr[i] = neg[n];
            n++;
            i++;
        }

        //trying to print the array
        // for(i=0;i<arr.length;i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }
        
    }
}
