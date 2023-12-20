/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution 
{
    public ListNode detectCycle(ListNode head)
    {
        //suppose head is null
        if(head==null)
        {
            return null;
        }
        
        ListNode curr = head; //first node
        
        ListNode slow = head;
        ListNode fast = head;   

        //meeting point
        ListNode temp = null;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)  //slow and fast meet(there is a cycle)
            {
                temp = slow;  
                break;
            }
        }

        if(temp==null) //cycle is not there
        {
            return null;
        } 

        //there is a cycle
        //move curr and temp, they will meet at a point.
        while(curr!=temp)
        {
            curr = curr.next;
            temp = temp.next;
        }
        return curr;
    }
}
