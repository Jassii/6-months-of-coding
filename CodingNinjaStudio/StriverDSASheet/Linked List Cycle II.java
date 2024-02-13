/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/
import java.util.*;
public class Solution 
{
    public static Node firstNode(Node head) 
    {
        //edge case
        if(head==null)
        {
            return null;
        }

        //now we will check if the cycle exists or not..
        //tortoise method
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            //if they both matches means, that the cycle exists
            if(slow==fast)
            {
                cycle=true;
                break;
            }
        }

        //but suppose console has come out of the loop, when it has reached null
        if(cycle==false)
        {
            return null; //cycle does not exists
        }

        //now it is confirm that the cycle exists
        Node curr=head;

        //move curr and fast one by one, as soon as they matches return the curr node.
        //that will be the starting node of the cycle.
        while(curr!=fast)
        {
            curr=curr.next;
            fast=fast.next;
        }
        
        return curr;
    }
}
