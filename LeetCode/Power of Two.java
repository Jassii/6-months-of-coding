class Solution 
{
    public boolean isPowerOfTwo(int n) 
    {
          
        //   int i;
        //   for(i=0;i<=30;i++)
        //   {
        //       if((int)Math.pow(2,i)==n)
        //       {
        //           return true;
        //       }
        //   }
        // return false;


        int ans=1;
        int i;
        for(i=0;i<=30;i++)
        {
            if(ans==n)
            {
                return true;
            }      
            if(ans < Integer.MAX_VALUE/2)
            {
                ans = ans*2;
            }
        }
        return false;
    }
}
