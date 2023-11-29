class Solution 
{
    public int[] searchRange(int[] nums, int target) 
    {
        int occ[] = {-1,-1};
        occ[0] = firstOccurence(nums,target);
        occ[1] = lastOccurence(nums,target); 
        return occ;   
    }
  //function to calculate the first occurence of the key..
    public int firstOccurence(int arr[],int k)
    {
        int s = 0;
        int e = arr.length-1;
        int m = s + (e-s)/2;
        
        int ans=-1; //this will store the first occurence of the value.
        while(s<=e)
        {
            if(arr[m]==k) //if the value at mid position matches the key.
            {
                ans = m; //store the index position of the key..
                e = m - 1; //now move to the left part..
            }
            else if(arr[m]>k)
            {
                e = m-1;
            }
            else
            {
                s = m+1;
            }
            m = s + (e-s)/2;
        }
        return ans;
    }

    //function to print the last occurence of the key
    public int lastOccurence(int arr[],int k)
    {
        int s = 0;
        int e = arr.length-1;
        int m = s + (e-s)/2;
        
        int ans=-1; //this will store the first occurence of the value.
        while(s<=e)
        {
            if(arr[m]==k) //if the value at mid position matches the key.
            {
                ans = m; //store the index position of the key..
                s = m + 1; //move to the right part inoder to find the last occurence.
            }
            else if(arr[m]>k)
            {
                e = m-1;
            }
            else
            {
                s = m+1;
            }
            m = s + (e-s)/2;
        }
        return ans;
    }
}
