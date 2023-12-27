/*****************************************************
  
  Following is the structure of Node.
  public static class Node {
    
    int data;
    Node next;

    Node(int data) {
      this . data = data;
      this . next = null;
    }
  }

*****************************************************/

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.HashMap;

public class Solution 
{
  public static Node removeLoop(Node head) 
  {
    if(head==null || head.next==null)
    {
      return head;
    }

    //detect the loop in the linked list(intersection point)
    Node detect = detectLoop(head);
    if(detect==null)
    {
      return head;
    }

    //find the node in the linked list where loop starts
    Node temp = findNode(head);
    if(temp==null)
    {
      return head;
    }
    //got the node where loop starts..
    
    //now find the previous node of the temp..
    Node curr = detect;
    while(curr.next!=temp)
    {
      curr = curr.next;
    }
    curr.next = null; 
    return head;

  }

  public static Node detectLoop(Node head)
  {
    Node slow = head;
    Node fast = head;
    while(fast!=null && fast.next!=null)
    {
      slow = slow.next;
      fast = fast.next.next;
      if(slow==fast)
      {
        return slow;
      }
    }
    return null;
  }
  public static Node findNode(Node head)
  {
    Node slow = head;
    Node fast = head;
    Node curr = head;

    Node temp = null;
    while(fast!=null && fast.next!=null)
    {
      fast = fast.next.next;
      slow = slow.next;
      //there is an intersection point(loop is there)
      if(slow==fast)
      {
        temp = slow;
        break;
      }
    }
    //if loop is not there
    if(temp==null)
    {
      return null;
    }

    //loop exists
    while(curr!=temp)
    {
      curr = curr.next;
      temp = temp.next;
    }
    return curr;
  }
}
