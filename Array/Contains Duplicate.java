class Solution 
{
    public boolean containsDuplicate(int[] nums) 
    {
        Set<Integer> set = new HashSet<>();
        int i;
        for(i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
            {
                return true;
            }
            else
            {
                set.add(nums[i]);
            }
        }
        return false;
        
        
        // Map<Integer,Integer> mp = new HashMap<>();
        // int i;
        // for(i=0;i<nums.length;i++)
        // {
        //     if(mp.containsKey(nums[i]))
        //     {
        //         mp.put(nums[i],mp.get(nums[i])+1);
        //     }
        //     else
        //     {
        //         mp.put(nums[i],1);
        //     }
        // }
        // // System.out.println(mp);
        // for(Map.Entry<Integer,Integer> m : mp.entrySet())
        // {
        //     if(m.getValue()>1)
        //     {
        //         return true;
        //     }
        // }
        // return false;
    }
}
