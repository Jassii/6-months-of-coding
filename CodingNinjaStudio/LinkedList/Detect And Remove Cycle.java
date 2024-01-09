import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

        class Node
        {
        	int data;
	        Node next;
	        Node(int data)
	        {
		        this.data = data;
		        this.next = null;
	        }
	        
        }
        
*****************************************************************/

public class Solution 
{
	public static boolean detectAndRemoveCycle(Node head) 
	{
		// Write your code here.
		
		//checking if the cycle exists or not
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
			//means that the cycle exists.
			if(slow==fast)
			{
				break;
			}
		}
		//means that the linked list does not have a cycle
		if(fast==null)
		{
			return false;
		}

		//now we know that the cycle exists.
		Node temp = fast;
		Node curr = head;
		
		//move temp and curr..and note its meeting point..
		while(temp!=curr)
		{
			temp = temp.next;
			curr = curr.next;
		}

		//it will come out from the loop, when both matches..
		
		//now traverse from the fast check if its next matches to the temp
		while(fast.next!=temp)
		{
			fast = fast.next;
		}
		
		//if fast.next==temp then point fast.next to null
		fast.next = null;
		return true;
	}
}
