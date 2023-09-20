class Solution 
{
    public int maxSubArray(int[] nums) 
    { 
        int currentmax = 0;
        int max = Integer.MIN_VALUE;

        int i;
        for(i=0;i<nums.length;i++)
        {
            //first take the sum
            currentmax = currentmax + nums[i];
            
            //we will check for the max sum value(comparing it with current max)
            max = Math.max(max,currentmax);
            if(currentmax<0)
            {
                currentmax = 0;
            }
        }
        return max;
    }
}
