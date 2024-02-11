import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the LinkedListNode class:
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {

	public static boolean isPalindrome(LinkedListNode<Integer> head) 
	{
		//edge condition
		if(head==null || head.next==null)
		{
			return true;
		}

		//find the middle node of the linked list
		LinkedListNode<Integer> slow=head;
		LinkedListNode<Integer> fast=head;
		
		//inorder to find the middle node of the linked list no
		//matter the length of the linked list 
		while(fast.next!=null && fast.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}

		//slow.next is the middle node of the LL
		LinkedListNode<Integer> newHead=reverse(slow.next);

		LinkedListNode<Integer> firstNode=head;
		LinkedListNode<Integer> secondNode=newHead;

		while(secondNode!=null)
		{
			if(!secondNode.data.equals(firstNode.data))
			{
				return false;
			}
			secondNode = secondNode.next;
			firstNode=firstNode.next;
		}
		return true;
	}
	public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> temp)
	{
		if(temp==null || temp.next==null)
		{
			return temp;
		}

		LinkedListNode<Integer> prev=null;
		LinkedListNode<Integer> curr=temp;
		LinkedListNode<Integer> next=null;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		return prev;
	}
}
