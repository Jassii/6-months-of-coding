class Solution 
{
    public int maxSubArray(int[] nums) 
    {
        //Kadane's algorithm
        int max = nums[0];
        int current_max = nums[0];
        
        int i;
        for(i=1;i<nums.length;i++)
        {
            current_max = Math.max(nums[i],nums[i]+current_max);
            max = Math.max(max,current_max);
        }
        return max;
    }
}
