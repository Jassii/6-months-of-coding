/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
 };

 *****************************************************************/

public class Solution
{
    public static Node removeKthNode(Node head, int K)
    {
        // Write your code here.
        if(head==null)
        {
            return null;
        }
        
        //find the size of the linked list
        int count=0;
        Node curr=head;
        while(curr!=null)
        {
            curr=curr.next;
            count++;
        }

        count = count-K+1; //from the starting
        curr=head;
        Node prev=null;
        for(int i=1;i<count;i++)
        {
            prev=curr;
            curr=curr.next;
        }

        //if the head node has to be deleted..
        //no updation on the prev node..
        //move head one pointer forward and return the head.
        if(prev==null)
        {
            head=head.next;
            return head;
        }
        else{
        //curr will be at the deleting node 
        prev.next = curr.next;
        curr.next=null;
        return head;
        }
    }
}
