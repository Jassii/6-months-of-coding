/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution 
{
    public int lengt(ListNode head)
    {
        ListNode temp = head;
        int length=0;
        while(temp!=null)
        {
            length++;
            temp = temp.next;
        }
        return length;
    }
    public ListNode reverseKGroup(ListNode head, int k) 
    {
        //base case
        if(head==null)
        {
            return null;
        }

        //length of the linked list
        int length = lengt(head);

        //now function to reverse linked list in k groups
        return kReverse(head,length,k);
    }

    public ListNode kReverse(ListNode head,int length,int k)
    {
        if(length<k)
        {
            return head;
        }

        //reverse k nodes.
        int count=0;
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while(curr!=null && count<k)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

         //Now make a recursive call for the remaining nodes
        if(next!=null)
        {
            head.next = kReverse(next, length-k , k); 
        }
        return prev;
    }
}
