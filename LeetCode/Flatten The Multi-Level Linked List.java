import java.util.* ;



import java.io.*; 
/*******************************************************

	Following is the Node class structure

	class Node {
	    int data;
	    Node next;
	    Node child;
	    
	    public Node(int data) {
	        this.data = data;
	    }
	}

*******************************************************/

public class Solution 
{
    
    public static Node flattenMultiLinkedList(Node head) 
	{
        // Write you code here.

		Node curr = head;
		Node last = head;

		while(curr!=null)
		{
			//move last pointer untill I find last.next==null..
			while(last.next!=null)
			{
				last = last.next;
			}

			//now will move curr..until I find child pointer..
			while(curr.next!=null && curr.child==null)
			{
				curr = curr.next;
			}

			last.next = curr.child;
			last = curr.child;
			curr = curr.next;	
		}
		return head;


		//take a queue which will store the child pointer node.
		// Queue<Node> q = new ArrayDeque<>(); 
		
		// Node curr = head;
		// while(curr!=null)
		// {
		// 	//means that it has reached at the last node of a level..
		// 	if(curr.next==null)
		// 	{
		// 		curr.next = q.poll();
		// 	}

		// 	if(curr.child!=null)
		// 	{
		// 		q.offer(curr.child);
		// 	}
		// 	curr = curr.next;
		// }
		// return head;
    }
}
