import java.util.* ;
import java.io.*; 

/************************************************************

    Following is the linked list node structure
    
    class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

************************************************************/


public class Solution {
	
	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {

        // Write your code here	
        LinkedListNode<Integer> curr = head;
        LinkedListNode<Integer> temp = null;
        Set<Integer> set = new HashSet<>();
        while(curr!=null)
        {
            if(set.contains(curr.data))
            {
                temp.next = curr.next;
                curr = curr.next;
            }
            else
            {
                set.add(curr.data);
                temp = curr;
                curr = curr.next;
            }
        }
        return head;
	}
}
