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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
       

        ListNode head=null;
        ListNode curr=null;
        ListNode temp1=list1;
        ListNode temp2=list2;
        if(temp1==null && temp2==null)
        {
            return head;
        }
        
        if(temp1==null)
        {
            return temp2;
        }
        if(temp2==null)
        {
            return temp1;
        }
    
            
        if(temp1.val<=temp2.val)
        {
            head=temp1;
            temp1=temp1.next;
        }
        else
        {
            head=temp2;
            temp2=temp2.next;
        }
        curr=head;
            

        while(temp1!=null && temp2!=null)
        {
            
            if(temp1.val<=temp2.val)
            {
                curr.next=temp1;
                curr=temp1;
                temp1=temp1.next;
            }
            else
            {
                curr.next=temp2;
                curr=temp2;
                temp2=temp2.next;
            }
        }
    

        while(temp1!=null)
        {
            curr.next=temp1;
            curr=temp1;
            temp1=temp1.next;
        }
        while(temp2!=null)
        {
            curr.next=temp2;
            curr=temp2;
            temp2=temp2.next;
        }
        curr.next=null;
        return head;
    }
}
