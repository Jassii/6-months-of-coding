class Solution 
{
    public void setZeroes(int[][] matrix) 
    {
        int i,j,k;
        
        int row = matrix.length;
        int col = matrix[0].length;
        //taking two dummay arrays..
        int dummy1[] = new int[row];
        int dummy2[] = new int[col];
        
        //fill the arrays..
        Arrays.fill(dummy1,-1);
        Arrays.fill(dummy2,-1);
        
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                if(matrix[i][j]==0)
                {
                    dummy1[i]=0;
                    dummy2[j]=0;
                }
            }
        }
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                if(dummy1[i]==0 || dummy2[j]==0)
                {
                    matrix[i][j]=0;
                }
            }
        }
    }
}
