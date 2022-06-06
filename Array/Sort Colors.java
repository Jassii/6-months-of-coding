class Solution 
{
    public void sortColors(int[] nums) 
    {
        int n = nums.length;
        int z=0,o=0,t=0;
        int i;
        
        //first calculate the sum of the zero's, one's and two's..
        for(i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                z++;
            }
            else if(nums[i]==1)
            {
                o++;
            }
            else
            {
                t++;
            }
        }
        
        //now it's time to enter 0,1 and 2's in the array..depending upon their counts.
        for(i=0;i<z;i++)
        {
            nums[i]=0;
        }
        for(i=z;i<(o+z);i++)
        {
            nums[i] = 1;
        }
        for(i=(o+z);i<n;i++)
        {
            nums[i] = 2;
        }
    }
}
