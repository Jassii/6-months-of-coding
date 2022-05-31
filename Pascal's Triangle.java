class Solution 
{
    public List<List<Integer>> generate(int numRows) 
    {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        int i,j;
        
        for(i=0;i<numRows;i++)
        {
            List<Integer> lis = new ArrayList<>();
            for(j=0;j<=i;j++)
            {
                //for first and the last element.
                if(j==0 || j==i)
                {
                    lis.add(1);
                }
                else
                {
                    int sum = res.get(i-1).get(j) + res.get(i-1).get(j-1);
                    lis.add(sum);
                }
            }
            res.add(lis);
        }
        return res;
    }
}
