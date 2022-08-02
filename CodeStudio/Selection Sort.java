public class Solution 
{
	public static void selectionSort(int arr[], int n) 
    {
		// Write your code here.
        int i,j;
        for(i=0;i<n-1;i++)
        {
            int smallestIndex = i;
            for(j=i+1;j<n;j++)
            {
                if(arr[j]<arr[smallestIndex])
                {
                    smallestIndex = j;
                }
            }
            //now as I have got the minimum value in the array..
            //kindly swap with the element at the i'th position..
            
            int temp = arr[smallestIndex];
            arr[smallestIndex] = arr[i];
            arr[i] = temp;
        }
	}
}
