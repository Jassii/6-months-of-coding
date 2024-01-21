import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;

/*************************************************************

    Following is the Binary Tree node structure:

    class BinaryTreeNode<Integer> {
        int data;
        BinaryTreeNode<Integer> left;
        BinaryTreeNode<Integer> right;
        public BinaryTreeNode(int data) {
            this.data = data;
        }
    }

*************************************************************/

public class Solution 
{
    public static ArrayList<Integer> printRightView(BinaryTreeNode<Integer> root) 
    {
        ArrayList<Integer> arr = new ArrayList<>();
      //base condition
        if(root==null)
        {
            return arr;
        }
      //it will contain the nodes
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
      //traverse till the queue is empty(level order traversal)
        while(!queue.isEmpty())
        {  
          //size of the queue
            int n = queue.size();
            int i;
          //traverse the nodes level by level..
            for(i=1;i<=n;i++)
            {
                BinaryTreeNode temp = queue.poll();
              //if the node is the last node of the level..add its data into the list
                if(i==n)
                {
                    arr.add(temp.data);
                }
              //if temp ka left exists krta hai toh add krdo usko queue me
                if(temp.left!=null)
                {
                    queue.add(temp.left);
                }
              //similarly right side kliye bhi
                if(temp.right!=null)
                {
                    queue.add(temp.right);
                }
            }
        }
        return arr;
    }
}
