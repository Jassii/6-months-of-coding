import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

    class Node
    {
    	public int data;
        public Node next;
        Node(int data)
        {
	        this.data = data;
	        this.next = null;
        }
    };

*****************************************************************/

public class Solution {
	public static  Node delAddLastNode(Node head) 
    {
		// Write your code here.

      //base case
        if(head==null || head.next==null)
        {
            return head;
        }
        //move curr pointer and maintian the prev pointer
        Node curr = head;
        Node prev = null;
        
        while(curr.next!=null)
        {
            prev = curr;
            curr = curr.next;
        }

        //reached to the last node..
        prev.next = null; //removed the last node

        //now add the curr at the front of the linked list
        curr.next = head;
        head = curr;
      //at last return the head of the linked list
        return head;
	}
}
