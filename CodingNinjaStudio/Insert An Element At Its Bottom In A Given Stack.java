import java.util.* ;
import java.io.*; 
public class Solution 
{
  public static Stack<Integer> pushAtBottom(Stack <Integer> myStack, int x) 
  {
    // Write your code here

    //call a function in which recursive approach will be followed
    pushNumber(myStack,myStack.size(),x);
    return myStack;
  }

  public static void pushNumber(Stack <Integer> myStack,int size,int x)
  {
    //means that the stack is now empty
    if(size==0)
    {
      myStack.push(x);
      return;
    }
    
    //maintain the popped element.
    int num = myStack.peek();
    
    myStack.pop();

    //recursion approach.
    pushNumber(myStack,myStack.size(), x);

    //now add the popped element
    myStack.push(num);

  }
}
