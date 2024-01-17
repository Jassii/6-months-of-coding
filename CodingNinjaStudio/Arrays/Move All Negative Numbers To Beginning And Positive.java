import java.util.*;
public class Solution 
{
    public static int[] separateNegativeAndPositive(int a[]) 
    {
        int i,j;
        i=0;
        j=a.length-1;

        while(i<=j)
        {
            if(a[i]>0) //if left side is greater than 0.
            {
                //check for the right side
                if(a[j]<0)
                {
                    //swap both of them
                    swap(a,i,j);
                    i++;
                    j--;
                }
                else if(a[j]>=0)
                {
                    j--;
                }
            }
            else
            {
                i++;
            }
        }
        return a;  
    }
    public static void swap(int a[],int i,int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
