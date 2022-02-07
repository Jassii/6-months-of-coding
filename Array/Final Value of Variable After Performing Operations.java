// There is a programming language with only four operations and one variable X:

//     ++X and X++ increments the value of the variable X by 1.
//     --X and X-- decrements the value of the variable X by 1.

// Initially, the value of X is 0.

// Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.

class Solution 
{
    public int finalValueAfterOperations(String[] operations) 
    {
        int x=0;  //initial value of x..
        int i;
        for(i=0;i<operations.length;i++)
        {
            String s = operations[i];
            
            //increment operation
            // if(s.equals("++X") || s.equals("X++"))
            // {
            //     x++;
            // }
            // else//decrement operation
            // {
            //     x--;
            // }
            
            //another method
            
            if(s.contains("-"))
            {
                x--;
            }
            else
            {
                x++;
            }
            
        }
       return x; 
    }
}
