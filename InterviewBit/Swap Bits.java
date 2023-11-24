public class Solution 
{
    public int solve(int A, int B, int C) 
    {
        //need to check Bth bit and Cth bit..
        
        int Bbit = (A >> (B-1)) & 1;
        int Cbit = (A >> (C-1)) & 1;
        
        if(Bbit!=Cbit)
        {
            //swapping has to be done
            A = A ^ (1 << (B-1));  //shift 1 left B-1 times and do xor with A..(you will be get opposite value at Bth position)
            A = A ^ (1 << (C-1)); //similarly here also
        }   
        return A; //if they both are same simply return the number..as no changes will be made 
        
    }      
}
