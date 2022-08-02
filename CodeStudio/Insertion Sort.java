
public class Solution {

	public static void insertionSort(int n , int[] arr) {
		// Write your code here.
        
        //array gets divided into two parts...(sorted and unsorted array..)
        int i,j;
        
        //we will consider that the 0th index value is sorted..
        for(i=1;i<n;i++)
        {
            int current = arr[i]; //jisko hume uthana hoga..
            j=i-1;//ith value se pehle sorted array banana hai...
            while(j>=0 && current<arr[j]) //we will traverse back..
            {
                arr[j+1] = arr[j]; //ek ek right shift krte chalo..
                j--;
            }
          //placement of the current element..
            arr[j+1] = current;
        }
	}
}
