//User function Template for Java


/* class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}*/

class Solution 
{
    //Function to find first node if the linked list has a loop.
    public static int findFirstNode(Node head)
    {
        //code here
        Node curr = head;
        Node slow = head;
        Node fast = head;
        
        Node temp = null;
        
        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow)
            {
                temp = slow;
                break;
            }
        }
        
        //if the loop does not exists
        if(temp==null)
        {
            return -1;
        }
        
        //loop exists
        while(curr!=temp)
        {
            curr = curr.next;
            temp = temp.next;
        }
        return curr.data;
        
    }
}
