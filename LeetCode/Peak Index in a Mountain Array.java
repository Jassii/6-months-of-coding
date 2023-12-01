class Solution 
{
    public int peakIndexInMountainArray(int[] arr) 
    {

        //Brute Force Approach..

        // int i;
        // for(i=1;i<arr.length-1;i++)
        // {
        //     if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
        //     {
        //         break; //simply return index of the position..
        //     }
        // }  
        // return i;


        //Some Optimized Approach..
        // [0,2,1,0]
        // int l = 0;
        // int e = arr.length-1;
        // int m = l + (e-l)/2;
        // int ans=-1;
        // while(l<=e)
        // {
            
        //         if(arr[m]>arr[m-1] && arr[m]>arr[m+1])
        //         {
        //             ans = m;
        //             break;
        //         }
        //          else if(arr[m]>arr[m+1] && arr[m]<arr[m-1])
        //         {
        //             e = m-1;
        //         }
        //         else
        //         {
        //             l = m+1;
        //         }
            
        //      m = l + (e-l)/2;
        // }
        // return ans;

        int s = 0;
        int e = arr.length-1;
        int mid = s + (e-s)/2;
        while(s<e) //no need to use equal sign and the same thing happens when there
        //are only two elements left and one also.
        {
            //if it is in the left side
            if(arr[mid]<arr[mid+1])
            {
                s = mid+1;
            }
            else
            {
                e = mid;
            }
            mid = s + (e-s)/2;
        }
        return s;

    }
}
