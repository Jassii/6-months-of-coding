class Solution 
{
    public int bitwiseComplement(int n) 
    {
      //base case
         if(n==0)
        {
            return 1;
        }
        
        //first initializing mask with 0
        int mask = 0;

        int tmp = n;
        while(tmp!=0)
        {
            tmp = tmp>>1; //right shift by one

            //for each right shift, left shift the mask by one and do OR with 1
            mask = mask<<1;
            mask = mask | 1;
        }
        //your mask will be created.

        int y = ~n & mask;
        return y;
    }
}
