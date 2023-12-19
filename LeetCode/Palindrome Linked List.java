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
    public boolean isPalindrome(ListNode head) 
    {
      //take a stack data structure
        Stack<Integer> stack = new Stack<Integer>();

        //push the data in the stack..
        ListNode temp = head;
        while(temp!=null)
        {
            stack.push(temp.val);
            temp = temp.next;
        }   
        //stack has been filled

        //comparison between data
        temp = head;
        while(temp!=null)
        {
            int v = stack.pop();
            if(temp.val!=v)
            {
                return false;
            }
            // stack.pop(); //pop the top element from the stack
            temp = temp.next; //forward the temp
        }
        return true;
    }
}
