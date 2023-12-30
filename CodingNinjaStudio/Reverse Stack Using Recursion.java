import java.util.Stack;

public class Solution 
{
    
	public static void reverseStack(Stack<Integer> stack) 
	{
		// write your code here
		
		//check if stack is empty(base case)
		if(stack.isEmpty())
		{
			return;
		}

		//maintain the peek element
		int num = stack.peek();
		stack.pop();

		//recursive approach which will reverse the stack
		reverseStack(stack);

		//insert the popped element at the bottom of the stack..
		insertAtBottom(stack, num);

	}

  //insert at bottom function..
	public static void insertAtBottom(Stack<Integer> stack,int x)
	{
		//is stack is empty
		if(stack.isEmpty())
		{
			stack.push(x);
			return;
		}

		//maintain the peek element
		int num = stack.peek();
		stack.pop();
		//recursive call
		insertAtBottom(stack, x);
		//push the popped element..
		stack.push(num);
	}
}
