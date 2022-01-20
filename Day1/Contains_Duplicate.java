class Solution 
{
    public boolean containsDuplicate(int[] nums) 
    {
        //take empty arraylist.
        Set<Integer> set = new HashSet<Integer>();
        
        //traverse the array and insert each value in the set.
        //if the number is present in the set already..
        //return true..
        //else at the end return false..
        
        int i;
        for(i=0;i<nums.length;i++)
        {
            if(!set.contains(nums[i]))
            {
                set.add(nums[i]);
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}
