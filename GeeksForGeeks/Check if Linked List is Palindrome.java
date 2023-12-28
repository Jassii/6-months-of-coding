// } Driver Code Ends


/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/

class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
        
        if(head==null || head.next==null)
        {
            return true;
        }
        
        Node curr = head;
        
        //first find the middle node of the linked list
        Node mid = middle(head);
        
        
        //now reverse the nodes after the mid node.
        Node rev = reverse(mid);
        
        //now traverse 
        while(rev!=null)
        {
            if(curr.data==rev.data)
            {
                curr = curr.next;
                rev = rev.next;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    
    Node reverse(Node middle)
    {
        Node prev = null;
        Node curr = middle;
        while(curr!=null)
        {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    
    
    Node middle(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //middle node of the linked list
    }
}
