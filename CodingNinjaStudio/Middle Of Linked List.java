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
    public static Node findMiddle(Node head)
    {
        // Write your code here.

        //Optimized Approach

     //taking slow and fast pointer..
        Node slow = head;
        Node fast = head;
    
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

        
        // if(head==null || head.next==null)
        // {
        //     return head;
        // }

        // int n = 1;
        // Node curr = head;
        // while(curr.next!=null)
        // {
        //     curr = curr.next;
        //     n++;
        // }

        // int mid = (n/2)+1;  //3
        // curr = head; 
        

        // while(mid>1)
        // {
        //     curr = curr.next;
        //     mid--;
        // }
        // return curr;
    }
}
