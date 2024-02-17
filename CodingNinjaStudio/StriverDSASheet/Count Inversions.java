import java.util.* ;


import java.io.*; 
public class Solution 
{
    public static long getInversions(long arr[], int n) 
    {
        //optimized approach

        //we will take the help of merge sort
        return mergeSort(arr,0,n-1);
        // return count;


        //brute force approach
        // long count=0;
        // int i,j;
        // for(i=0;i<n-1;i++)
        // {
        //     for(j=i+1;j<n;j++)
        //     {
        //         if(arr[i]>arr[j])
        //         {
        //             count++;
        //         }
        //     }
        // }
        // return count;
    }
    public static long mergeSort(long arr[],int l,int h)
    {
        
        long count=0;
        //atleast two elements should be there
        if(l>=h)
        {
            return count;
        }
        
        int mid = (l+h)/2;
        count += mergeSort(arr,l,mid);
        count += mergeSort(arr,mid+1,h);
        count += merge(arr,l,mid,h);
        
        return count;
    }

    public static long merge(long arr[],int l,int m,int h)
    {
        //create two arrays
        long count=0;

        int n1 = m-l+1;
        int n2 = h-m;

        long a[] = new long[n1];
        long b[] = new long[n2];

        // fill the value in the array..
        int i,j;
        for(i=0;i<n1;i++)
        {
            a[i] = arr[i+l];
        }

        for(j=0;j<n2;j++)
        {
            b[j] = arr[m+1+j];
        }

        // now traverse both the arrays individually and try to create a single sorted array
        i=0;
        j=0;
        int k=l; //for the result array
        while(i<n1 && j<n2)
        {
            if(a[i]<=b[j])
            {
                arr[k]=a[i];
                i++;
                k++;
            }
            else//jth element is smaller..
            {
                //inversion achieved so increase the count
                count += (n1-i);

                arr[k]=b[j];
                j++;
                k++;
            }
        }

        while(i<n1)
        {
            arr[k]=a[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k]=b[j];
            j++;
            k++;
        }
        return count;
    }
}
