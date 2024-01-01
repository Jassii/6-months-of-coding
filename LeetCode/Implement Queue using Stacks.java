import java.util.*;
class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public MyQueue() 
    {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void push(int x) 
    {
        //push the element using stack.
        stack1.push(x);
    }
    
    public int pop() 
    {
        //if stack1 is empty
        // if(stack1.isEmpty())
        // {
        //     return 
        // }

        //pop the element from stack 1, and push the element in stack 2
        while(!stack1.isEmpty())
        {
            int value = stack1.peek();
            stack2.push(value);
            stack1.pop();
        }

        //now stack 1 is empty..stack 2 topmost element will be popped (FIFO)
        int ans = stack2.pop();

        //rest of the remaining elements will be pushed in the stack 1.
        while(!stack2.isEmpty())
        {
            int value = stack2.peek();
            stack1.push(value);
            stack2.pop();
        }
        return ans;
    }
    
    public int peek() 
    {
        //pop the element from stack 1, and push the element in stack 2
        while(!stack1.isEmpty())
        {
            int value = stack1.peek();
            stack2.push(value);
            stack1.pop();
        }
        int ans =  stack2.peek(); //front of the queue.

        //now elements in the stack2 will be pushed back in the stack 1.
        while(!stack2.isEmpty())
        {
            int value = stack2.peek();
            stack1.push(value);
            stack2.pop();
        } 

        return ans;
    }
    
    public boolean empty() 
    {
        return stack1.isEmpty();    
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
