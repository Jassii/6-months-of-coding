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

public class Solution
{
    public static Node sortList(Node head) 
    {
        // Write your code here
        int countZ=0;
        int countO=0;
        int countT=0;

        //traverse the linked list and take the count of
        //0s,1s and 2s..

        Node curr = head;
        while(curr!=null)
        {
            if(curr.data==0)
            {
                countZ++;
                curr = curr.next;
            }
            else if(curr.data==1)
            {
                countO++;
                curr = curr.next;
            }
            else
            {
                countT++;
                curr = curr.next;
            }
        }

        //now we have the count of 0s,1s and 2s..

        //now if we traverse the linked list and update the value 
        //of the nodes
        curr = head;
        while(curr!=null)
        {
            while(countZ>0)
            {
                curr.data = 0;
                countZ--;
                curr = curr.next;
            }
            //zero has been completed..

            while(countO>0)
            {
                curr.data = 1;
                countO--;
                curr = curr.next;
            }
            //similar for one..
          
            while(countT>0)
            {
                curr.data = 2;
                countT--;
                curr = curr.next;
            }
          //similar for two..
        }
        return head;
    }
}
