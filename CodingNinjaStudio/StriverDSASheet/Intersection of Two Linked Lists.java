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
import java.util.*;

public class Solution 
{
    public static int findIntersection(Node firstHead, Node secondHead) 
    {
        //optimized approach having space complexity as O(1)...

        //find the length of both the linked lists
        int countf=0;
        int counts=0;
        
        Node curr=firstHead;
        while(curr!=null)
        {
            countf++;
            curr=curr.next;
        }
        
        curr=secondHead;
        while(curr!=null)
        {
            counts++;
            curr=curr.next;
        }

        //i have length of both the linked lists

        //find out the max length linked list
        
        int value = 0;
        //both have same length
        if(countf<counts)
        {
            value = counts-countf;
            while(value>0)
            {
                secondHead = secondHead.next;
                value--;
            }
        }
        else if(counts<countf)
        {
            value = countf-counts;
            while(value>0)
            {
                firstHead = firstHead.next;
                value--;
            }
        }

        while(firstHead!=null && secondHead!=null)
        {
            if(firstHead==secondHead)
            {
                return firstHead.data;
            }
            firstHead = firstHead.next;
            secondHead = secondHead.next; 
        }
        return -1;
        
        

        //brute force approach

        // HashMap<Node,Boolean> map = new HashMap<>();
        
        // //traverse first linked list
        // Node curr=firstHead;
        // while(curr!=null)
        // {
        //     map.put(curr,true);
        //     curr=curr.next;
        // }
        
        // int value=-1;
        // //traverse the second linked list
        // curr=secondHead;
        // while(curr!=null)
        // {
        //     if(!map.containsKey(curr))
        //     {
        //         map.put(curr,true);
        //     }
        //     else
        //     {
        //         value=curr.data;
        //         break;
        //     }
        //     curr = curr.next;
        // }
        // return value;



        // ArrayList<Node> arr = new ArrayList<>();
        
        // // //traversing only the first linked list
        // Node curr=firstHead;
        // while(curr!=null)
        // {
        //     arr.add(curr);
        //     curr=curr.next;
        // }

        // //now traverse the second linked list
        // int value=-1;
        // curr=secondHead;
        // while(curr!=null)
        // {
        //     if(arr.contains(curr))
        //     {
        //         value = curr.data;
        //         break;
        //     }
        //     curr=curr.next;
        // }
        // return value;
    }
}
