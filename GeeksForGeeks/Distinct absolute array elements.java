class Solution 
{
    int distinctCount(int[] arr, int n) 
    {
        // code here
        
        //it is better to take HashSet..(TC -> O(1))
        HashSet<Integer> hset = new HashSet<>();
        int i,count=0;
        for(i=0;i<n;i++)
        {
            if(hset.contains(Math.abs(arr[i])))
            {
                continue;
            }
            else
            {
                hset.add(Math.abs(arr[i]));
                count++;
            }
        }
        
        return count;
    }
}
