class Solution 
{
    long subMatrixSum(int arr[][], int n, int m, int x1, int y1, int x2, int y2) 
    {
        // code here
        int i,j;
        long sum=0;
        for(i=x1-1;i<=x2-1;i++)
        {
            for(j=y1-1;j<=y2-1;j++)
            {
                sum = sum + arr[i][j];
            }
        }
        return sum;
    }
}
