import java.io.*;
import java.util.* ;

/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Solution 
{
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) 
    {
		// Write your code here.
        LinkedListNode<Integer> temp1 = first;
        LinkedListNode<Integer> temp2 = second;
        LinkedListNode<Integer> head = null;
        if(temp1.data<=temp2.data)
        {
            head = temp1;
            temp1 = temp1.next;
        }
        else
        {
            head = temp2;
            temp2 = temp2.next;
        }

        //now i have got the head of the combined linked list..
        
        //curr will be a pointer for the combined linked list
        LinkedListNode<Integer> curr = head;

        //traverse both the linked list at a time
        while(temp1!=null && temp2!=null)
        {
            if(temp1.data<=temp2.data)
            {
                curr.next = temp1;
                curr = temp1;
                temp1 = temp1.next;
            }
            else
            {
                curr.next = temp2;
                curr = temp2;
                temp2 = temp2.next;
            }
        }
        while(temp1!=null)
        {
            curr.next = temp1;
            curr = temp1;
            temp1 = temp1.next;
        }
        while(temp2!=null)
        {
            curr.next = temp2;
            curr =temp2;
            temp2 = temp2.next;
        }

        //both have reached to its null
        curr.next = null;
        return head;
	}
}
