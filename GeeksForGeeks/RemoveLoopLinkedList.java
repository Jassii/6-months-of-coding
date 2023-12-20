/*
class Node
{
    int data;
    Node next;
}
*/

class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head)
    {
        // code here
        // remove the loop without losing any nodes
        if(head==null)
        {
            return;
        }
        
        Node curr = head; //current node.
      
        Node slow = head;
        Node fast = head;
        
        Node temp = null; 
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow==fast)
            {
                temp = slow;
                break;
            }
        }
        
        //cycle does not exist
        if(temp==null)
        {
            return;
        }
        
        //cycle exists.
        while(curr!=temp)
        {
            curr = curr.next;
            temp = temp.next;
        }
        
        //curr will point to the node..where loop starts...
        
        //now if find the prev node of the curr...then our problem will be solved
        Node prev = curr;
        while(prev.next!=curr)
        {
            prev = prev.next;
        }
        
        //then point prev.next to null
        
        prev.next = null; //loop removed.
        return;
    }
}
