import java.util.* ;
import java.io.*; 
public class TwoStack {
	int arr[]; //array
	int top1; //top of first stack  //from left to right..
	int top2; //top of second stack //from right to left..
	int size; //size of the array

	// Initialize TwoStack.
	public TwoStack(int s) {
		// Write your code here
		this.size = s;
		arr = new int[s];  //initialize an array.
		top1 = -1; //no element in the first stack
		top2 = size; //no element in the second stack
	}

	// Push in stack 1.
	public void push1(int num) {
		// Write your code here

		//atleast one position is there in an array
		if((top2-top1)>1)
		{
			top1++;
			arr[top1]=num;
		}
		else
		{
			return;
		}
		
	}

	// Push in stack 2.
	public void push2(int num) {
		// Write your code here

		//atleast one position is there in an array
		if(top2-top1>1)
		{
			top2--;
			arr[top2]=num;
		}
		else
		{
			return;
		}
	}

	// Pop from stack 1 and return popped element.
	public int pop1() {
		// Write your code here
		
		//underflow
		if(top1==-1)
		{
			return -1;
		}
		int res = arr[top1];
		top1--;
		return res;

	}

	// Pop from stack 2 and return popped element.
	public int pop2() {
		// Write your code here
		//underflow
		if(top2==size)
		{
			return -1;
		}
		int res = arr[top2];
		top2++;
		return res;

	}
}
