class Solution 
{
    public int pivotIndex(int[] nums) 
    {
        int i;
        //total sum of the array
        int sum = 0; 
        for(i=0;i<nums.length;i++)
        {
            sum = sum + nums[i];
        }

        int leftSum = 0;   
        int rightSum = sum;  

        //again traverse the array
        for(i=0;i<nums.length;i++) 
        {
            //First subtract the value from the rightSum and compare it with the left sum, if it does not matches..then add that value to the leftSum..
            rightSum = rightSum - nums[i];

            //check if they both are same
            if(leftSum==rightSum)   
            {
                return i;
            }
            //now add value to the leftSum..
            leftSum = leftSum + nums[i];   
        }
        return -1;
    }
}
