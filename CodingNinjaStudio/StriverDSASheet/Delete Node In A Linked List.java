import java.io.*;
import java.util.* ;

/****************************************************************

    Following is the class structure of the LinkedListNode class:

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
        LinkedListNode(T data)
        {
            this.data = data;
            this.next = null;
        }
    }

*****************************************************************/

public class Solution 
{
	public static void deleteNode(LinkedListNode<Integer> node) 
    {
		//very basic approach

        //as we know that the node is not at tail..
        //so we can access the next node of node
        LinkedListNode<Integer> curr = node.next;
        node.data=curr.data;
        node.next = curr.next;
	}
}
