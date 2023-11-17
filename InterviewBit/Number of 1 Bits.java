public class Solution 
{
	public int numSetBits(long a) 
    {
        int count=0;
         
        //we will right shift the number(till the number becomes 0)and check if the last digit is 1 then simply
        //increase the count value
        
        //base case
        if(a==0)
        {
            return 0;
        }
        
        while(a!=0)
        {
            a = a & (a-1); //this will change the least significant set bit to 0
            count++;
        }
        return count;
	}
}
