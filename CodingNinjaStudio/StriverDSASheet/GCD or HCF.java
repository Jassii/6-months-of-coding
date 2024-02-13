public class Solution 
{
    public static int calcGCD(int n, int m)
    {
        
        //Brute Force Approach

        // int value = Math.min(n,m);
        // int gcd=1;
        // int i;
        // for(i=1;i<=value;i++)
        // {
        //     if(n%i==0 && m%i==0)
        //     {
        //         gcd = Math.max(gcd,i);
        //     }
        // }

        // for(i=value;i>=1;i--)
        // {
        //     if(n%i==0 && m%i==0)
        //     {
        //         gcd=i;
        //         break;
        //     }
        // }

        // return gcd;
        
        while(n>0 && m>0)
        {
            if(n>m)
            {
                n=n%m;
            }
            else
            {
                m=m%n;
            }
        }

        if(n==0)
        {
            return m;
        }
        return n;
    }
}
