public class Solution 
{
    public int solve(int A) 
    {
        if(A==1) //if the value is 1..then no trailing zeroes will be there..
        {
            return 0;
        }
        
        int count=0;
        //need to find the last bit.
        //if the last bit is 0..increase the count
        while(A!=1)
        {
            if((A & 1) == 0) //means that the last bit is 0
            {
                count++;
                //right shift the A..
                A = A >> 1; //one time
            }
            else
            {
                break;
            }
        }
        return count;
    }
}
