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
    public boolean hasCycle(ListNode head) 
    {
        //if list is empty or only one node is there
        if(head==null || head.next==null)
        {
            return false;
        }

        //taking slow and fast pointer
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null)
        {
            //if the slow and fast Node matches..
            if(slow==fast)
            {
                return true;
            }
            //else move the slow and fast node
            slow = slow.next;
            fast = fast.next.next;
        }
        
        //if nothing matches(fast can be null or its next node is null)
        //return false
        return false;
    }
}
