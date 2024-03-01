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
 };

 *****************************************************************/

import java.util.*;
public class Solution 
{
    public static Node rotate(Node head, int k) 
    {
        
        //brute force approach
        
        //check for edge cases
        if(head==null || head.next==null)
        {
            return head;
        }

        //get the size of the linked list
        int count=0;
        Node temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }

        //if the k value is very large, then simply do mod with the size of the linked list
        //it will decrease the value of k..saving time complexity..
        k = k%count;

        int i;
        for(i=1;i<=k;i++)
        {
            Node curr=head;
            while(curr.next.next!=null)
            {
                curr=curr.next;
            }

            //now curr is at the second last node
            //maintain the node of the last node
            Node last = curr.next;
            
            //point the second last node to null
            curr.next=null; 

            //point the last node to the head node..
            last.next=head;
            head=last;
        }
        return head;
    }
}
