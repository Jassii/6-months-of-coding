// Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

// Specifically, ans is the concatenation of two nums arrays.

// Return the array ans.

class Solution 
{
    public int[] getConcatenation(int[] nums) 
    {
        int n = nums.length;  
        int ans[] = new int[2*n];
            
        int i=0;
        //the for loop is taking 1ms to complete the execution..
        
        // for(i=0;i<n;i++)
        // {
        //     ans[i]=nums[i];
        //     ans[i+n] = nums[i];
        // }
        
        //but the while loop is taking 0ms to complete the execution..
        while(i<n)
        {
            ans[i] = nums[i];
            ans[i+n] = nums[i];
            i++;
        }
        return ans; 
    }
}
