/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}
*/

class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
         // Your code here
        if(head==null || head.next==null)
        {
            return head;
        }
        
        Node curr = head;
        Node temp = null;
        Set<Integer> set = new HashSet<>();
        // Map<Integer,Boolean> visited = new HashMap<Integer,Boolean>();
        
        while(curr!=null)
        {
            if(set.contains(curr.data))
            {
                temp.next = curr.next;
                curr = curr.next;
            }
            else
            {
                set.add(curr.data);
                temp = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}
