import java.util.*;
class MyStack {

    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() 
    {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();    
    }
    
    public void push(int x) 
    {
        q1.offer(x);
    }
    
    public int pop() 
    {
        while(q1.size()!=1)
        {
            q2.offer(q1.peek());
            q1.poll();
        }
        int ans = q1.peek();
        q1.poll(); //remove the single element.

        //now add the remaining elements from the queue 2..
        while(!q2.isEmpty())
        {
            q1.offer(q2.peek());
            q2.poll();
        }
        return ans;
    }
    
    public int top() 
    {
        while(q1.size()!=1)
        {
            q2.offer(q1.peek());
            q1.poll();
        }
         
        int ans = q1.peek();  

        q2.offer(ans);
        q1.poll();

        while(!q2.isEmpty())
        {
            q1.offer(q2.peek());
            q2.poll();
        }
        return ans;
    }
    
    public boolean empty() 
    {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
