/********************************************************

    Following is the class structure of the Node class:
    
    class Node
    {
        public:
            int data;
            Node next;
            Node(int data)
            {
                this.data = data;
                this.next = null;
            }
    };

********************************************************/

public class Solution 
{
    public static Node uniqueSortedList(Node head) 
    {
        // Write your code here.

      //start from the head node
        Node curr = head;
      //traverse the curr node
        while(curr!=null && curr.next!=null)
        {
          //if data does not matches
            if(curr.next.data!=curr.data)
            {
                curr = curr.next;
            }
            else //if data matches
            {
                curr.next = curr.next.next;  //break the connection
            }
        }
        return head; //at last return the head node.
    }
}
