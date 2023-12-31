import java.util.* ;
import java.io.*; 
public class Queue 
{
    private int arr[];
    private int front;
    private int rear;
    private int size;

    Queue() {
        // Implement the Constructor
        front = 0;
        rear = 0;
        size = 100001; //taken a random value..
        arr = new int[size];

    }

    /*----------------- Public Functions of Queue -----------------*/

    boolean isEmpty() {
        // Implement the isEmpty() function
        return (front==rear);
    }

    void enqueue(int data) {
        // Implement the enqueue() function

        //check if the queue is full or not
        if(rear==size-1)
        {
            return;
        }
      //if not..then push the data from the rear..
        arr[rear] = data;
        rear++;

    }

    int dequeue() {
        // Implement the dequeue() function
        //check if the queue is empty
        if(front==rear)
        {
            return -1;
        }
        //get the value at the front..
        int value = arr[front];
        //move front forward
        front++;
        //if front==rear, that means the queue is empty..so resolving memory wastage issue, moving front and rear to index 0.
        if(front==rear)
        {
            front=0;
            rear=0;
        }
      //return the value which was at the front position
        return value;
    }

    int front() {
        // Implement the front() function

        //if the queue is empty
        if(front==rear)
        {
            return -1;
        }
        return arr[front];
    }
}
