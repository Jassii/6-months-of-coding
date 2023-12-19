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
    public ListNode middle(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //return the middle node
    }

    public ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null)
        {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev; //return the new head of the reversed list..
    }

    public boolean isPalindrome(ListNode head) 
    {
        //optimized solution

        //if list is empty
        if(head==null)
        {
            return true;
        }

        ListNode mid = middle(head); //middle Node
        ListNode last = reverse(mid);  //head of the reversed list (last Node) (reverse from the mid)

        //now comparison will be made
        ListNode curr = head;
        while(last!=null)
        {
            if(curr.val!=last.val)
            {
                return false;
            }
            curr = curr.next;
            last = last.next;
        }

        return true;

        // Stack<Integer> stack = new Stack<Integer>();

        // //push the data in the stack..
        // ListNode temp = head;
        // while(temp!=null)
        // {
        //     stack.push(temp.val);
        //     temp = temp.next;
        // }   
        // //stack has been filled

        // //comparison between data
        // temp = head;
        // while(temp!=null)
        // {
        //     int v = stack.pop();
        //     if(temp.val!=v)
        //     {
        //         return false;
        //     }
        //     // stack.pop(); //pop the top element from the stack
        //     temp = temp.next; //forward the temp
        // }
        // return true;
    }
}
