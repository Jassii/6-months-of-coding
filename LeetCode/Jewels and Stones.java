class Solution 
{
    public int numJewelsInStones(String jewels, String stones) 
    {
        int count=0;
        for(int i=0;i<stones.length();i++)
        {
            char c = stones.charAt(i);
            String s = String.valueOf(c);
            if(jewels.contains(s))
            {
                count++;
            }
        }
        return count;
    }
}
