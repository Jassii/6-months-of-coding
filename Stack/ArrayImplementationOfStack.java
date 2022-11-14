// implementation of stack using array.

import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        Stack S = new Stack(5); //passing the size of the stack..
        
        //now trying to push some elements..
        if(S.push(1))
        {
            System.out.println("Element has been pushed in the stack");
        }
        else
        {
            System.out.println("Stack is full");
        }
        
        if(S.push(2))
        {
            System.out.println("Element has been pushed in the stack");
        }
        else
        {
            System.out.println("Stack is full");
        }
        
        if(S.push(3))
        {
            System.out.println("Element has been pushed in the stack");
        }
        else
        {
            System.out.println("Stack is full");
        }
        
        if(S.push(4))
        {
            System.out.println("Element has been pushed in the stack");
        }
        else
        {
            System.out.println("Stack is full");
        }
        
        if(S.push(5))
        {
            System.out.println("Element has been pushed in the stack");
        }
        else
        {
            System.out.println("Stack is full");
        }
        
        if(S.push(6))
        {
            System.out.println("Element has been pushed in the stack");
        }
        else
        {
            System.out.println("Stack is full");
        }
    
        //get elements
        S.getElements();
        
        //fetch the top/peek element from the stack..
        S.topElement();
    }
}


class Stack
{
    int top;
    int arr[];
    
    //constructor
    Stack(int maxSize)
    {
        this.top = -1; //assigning the top value as -1.
        arr = new int[maxSize]; //declearing the array.
    }
    
    //push the element
    boolean push(int value)
    {
        if(top!=arr.length-1)
        {
            arr[top+1] = value;
            top = top+1;
            return true;
        }
        return false;
    }
    
    void getElements()
    {
        int i;
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    void topElement()
    {
        System.out.println(arr[top]);
    }
}
