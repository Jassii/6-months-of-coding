class Solution 
{
    public int subtractProductAndSum(int n) 
    {
        int product = 1;
        int sum = 0;
        int tmp = n;
        while(tmp>0)
        {
            int l = tmp%10; //last digit
            sum = sum + l;
            product = product * l;
            tmp = tmp/10;
        }
        return product - sum;    
    }
}
