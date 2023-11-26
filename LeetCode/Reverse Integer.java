class Solution 
{
    public int reverse(int x) 
    {
        int ans=0;
        while(x!=0)
        {
            
            int ldigit = x%10;

            //if you will try to multiple ans with 10..there is a chance that it will go out of range..(and won't be able to store)..hence it is better to divide by 10..
            if(ans<Math.pow(-2,31)/10 || ans>(Math.pow(2,31)-1)/10)
            {
                return 0;
            }
            ans = ans*10 + ldigit;
            x = x/10;
        }
        return ans;
    }
}
