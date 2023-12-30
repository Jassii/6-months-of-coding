//{ Driver Code Starts
//Initial template for Java

//User function Template for Java

class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack)
    {
        // code here
        
        // int count = 0;
        
        // int mid = -1;
        // //size of stack is even
        // if(sizeOfStack%2==0)
        // {
        //     mid = (sizeOfStack-1)/2;
        // }
        // else
        // {
        //     mid = sizeOfStack/2;
        // }
        
        // remove(s,sizeOfStack,count,mid);
        
        
        
        
        //below code working properly..
        Stack<Integer> stack = new Stack<>();
        int i;
        for(i=0;i<sizeOfStack/2;i++)
        {
            stack.push(s.peek());
            s.pop();
        }
        
        s.pop();//pop the middle element
        
        while(!stack.isEmpty())
        {
            s.push(stack.peek());
            stack.pop();
        }
        
    }
    
    // public void remove(Stack<Integer>s,int size, int count, int mid)
    // {
    //     if(count==mid)
    //     {
    //         s.pop();
    //         return;
    //     }
        
    //     int num = s.peek();
    //     s.pop();
        
    //     remove(s,size,count+1,mid);
        
    //     s.push(num);
    // }
}
