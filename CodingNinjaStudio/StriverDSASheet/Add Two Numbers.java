import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

    class LinkedListNode {
        int data;
        LinkedListNode next;
        
        public LinkedListNode(int data) {
            this.data = data;
        }
    }

*****************************************************************/


public class Solution 
{
    static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) 
    {
        // Write your code here.
        
        int carry=0;
        //take a dummy node
        LinkedListNode dummy = new LinkedListNode(-1);
        //pointer for the summation node
        LinkedListNode curr = dummy;

        
        while(head1!=null || head2!=null || carry==1)
        {
            int sum=0;
            //first check for the first node
            if(head1!=null)
            {
                sum += head1.data;
                head1=head1.next;
            }

            //then check for the second node
            if(head2!=null)
            {
                sum += head2.data;
                head2=head2.next;
            }

            //calculate the sum
            sum += carry;
            //take the carry
            carry=sum/10;
            //create a new node
            LinkedListNode node=new LinkedListNode(sum%10); 
            //point curr to the new node and move curr one forward
            curr.next=node;
            curr=curr.next;
        }
        return dummy.next;
    }
}
