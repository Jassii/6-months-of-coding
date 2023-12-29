import java.util.*;
public class Stack
{
    private static int arr[]; //array..
    private static int capacity;  //size of stack..
    private static int top; //top element..
    
    //constructor
    Stack(int size)
    {
        arr = new int[size];
        top = -1; //index of the topmost element.
        capacity = size;
    }
    
    
    //push elements in the stack..
    static void push(int value)
    {
        if(top==capacity-1)
        {
            System.out.println("Stack is full, no more elements can be pushed");
            // throw new Exception();
            return;
        }
        
        top++;
        arr[top] = value;
    }
    
    //pop elements from the stack
    static int pop()
    {
        //no elements is present in the stack
        if(top==-1)
        {
            System.out.println("No elements in the Stack.");
            // throw new Exception();
            return -1;
        }
        
        //there are elements in the stack.
        int res = arr[top];
        top--;
        return res;
    }
    
    //function to return the peek element from the stack..
    static int peek()
    {
        //if stack is empty
        if(top==-1)
        {
            System.out.println("Stack is empty");
            // throw new Exception();
            return -1;
        }
        return arr[top];
    }
    
    //function to check is Stack is Empty or not..
    static boolean isEmpty()
    {
        if(top==-1)
        {
            return true;
        }
        return false;
    }
    
    //function to print stack values
    static void printStack()
    {
        int i;
        for(i=0;i<=top;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
    
	public static void main(String[] args) 
	{
		//now its time to use Stack
		Stack stack = new Stack(5); //created object of the Stack Class.
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		stack.pop();
		
		stack.printStack();
		
	}
}
