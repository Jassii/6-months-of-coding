import java.util.*;

public class Stack
{
    public static class Node
    {
        int data;
        Node next;
    }
    
    static Node top; //will maintain the topmost node..
    
    //constructor
    Stack()
    {
       this.top = null; //no node at the beginning.
    }
    
    
    //push elements in the stack..
    static void push(int value)
    {
        //create an empty node
        Node temp = new Node();
        temp.data = value;
        temp.next = top;
        top = temp;
    }
    
    //pop elements from the stack
    static int pop()
    {
        //no node in the stack..
        if(top==null)
        {
            System.out.println("Stack is Empty..");
            return -1;
        }
        
        int value = top.data;
        top = top.next;
        return value;
    }
    
    //function to return the peek element from the stack..
    static int peek()
    {
        //if stack is empty
        if(top==null)
        {
            System.out.println("Stack is Empty..");
            return -1;
        }
        return top.data;
    }
    
    //function to check is Stack is Empty or not..
    static boolean isEmpty()
    {
        if(top==null)
        {
            return true;
        }
        return false;
    }
    
    //function to print stack values
    static void printStack()
    {
        Node temp = top;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
        }
    }
    
    
	public static void main(String[] args) 
	{
		//now its time to use Stack
		Stack stack = new Stack(); //created object of the Stack Class.
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		stack.pop();
		
		stack.printStack();
		
	}
}
