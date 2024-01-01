import java.util.* ;
import java.io.*; 
public class CircularQueue {

	private int front;
	private int rear;
	private int arr[];
	private int size;

	// Initialize your data structure.
	public CircularQueue(int n) {
		this.size = n;
		arr = new int[n];
		front=-1;
		rear=-1;
	}

	/*
	   Enqueues 'X' into the queue. Returns true if it gets pushed into the stack,
	   and false otherwise.
	*/
	public boolean enqueue(int value) 
	{
		// Write your code here.
		
		//check if queue is full or not
		if((rear+1)%size==front)
		{
			return false;
		}

		//if no element has been inserted as of now..(queue is empty) 
		if(front==-1)
		{
			front=0;
		}
		rear = (rear+1)%size;
		arr[rear] = value;
		return true;
	}

	/*
	  Dequeues top element from queue. Returns -1 if the stack is empty, otherwise
	  returns the popped element.
	*/
	public int dequeue() 
	{
		// Write you code here.

		//check if queue is empty
		if(front==-1)
		{
			return -1;
		}

		int ans = arr[front];
		
		if(front==rear)//only one element was there
		{
			front=-1;
			rear=-1;
		}
		else
		{
			front = (front+1)%size;
		}
		return ans;
	}
}
