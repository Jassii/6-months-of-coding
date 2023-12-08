class Solution 
{
    public int countPrimes(int n) 
    {
        // int i;
        // if(n<=1)
        // {
        //     return 0;
        // }    
        // int j;
        // int count=0;
        // for(i=2;i<n;i++)
        // {         
        //     int countF=0;              
        //     for(j=1;j<=i;j++)
        //     {
        //         if(i%j==0)
        //         {
        //             countF++;
        //         }
        //     } 
        //     if(countF==2)
        //     {
        //         count++;
        //     }
        // }
        // return count;

        if(n<=1)
        {
            return 0;
        }
        
      
      /////////////////////////////////////////// we can use sieve of erathosenes...
        boolean prime[]  = new boolean[n];
        
        //file the above array with true..
        Arrays.fill(prime,true);

        prime[0] = false;
        prime[1] = false;

        int i,j;
        for(i=2;i<n;i++)
        {
            for(j=2*i;j<n;j=j+i)
            {
                prime[j]=false;
            }
        }
        int count=0;
        for(i=0;i<n;i++)
        {
            if(prime[i]==true)
            {
                count++;
            }
        }
        return count;
    }
}
