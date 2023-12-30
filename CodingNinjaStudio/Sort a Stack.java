import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static void sortStack(Stack<Integer> stack) 
	{
		// Write your code here.
		
		//base case
		if(stack.isEmpty())
		{
			return;
		}

		//maintain the peek element
		int num = stack.peek();
		stack.pop();

		//recursive approach for the remaining stack elements.
		sortStack(stack);

		//insert the maintained popped element in the sorted manner..
		sortedInsert(stack,num);

	}

	//function to insert the element in the sorted manner
	public static void sortedInsert(Stack<Integer> stack,int x)
	{
		if(stack.isEmpty() || (!stack.isEmpty() && stack.peek()<x))
		{
			stack.push(x);
			return;
		}

		//if that is not the case..then pop the element from the
		//stack until you find the element which is less than x..
		int num = stack.peek();
		stack.pop();

		//recursive approach
		sortedInsert(stack, x);

		//push the element which were popped.
		stack.push(num);		
	}
}
