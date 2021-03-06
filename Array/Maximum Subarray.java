class Solution 
{
    public int maxSubArray(int[] nums) 
    {
        int curr_max = 0;
        int max_so_far = 0;
        int i;
        for(i=0;i<nums.length;i++)
        {
            curr_max = Math.max(nums[i],curr_max+nums[i]);
            max_so_far = Math.max(max_so_far,curr_max);
        }
        return max_so_far;
    }
}
