/*********************************************

 Following is the TreeNode class structure

 class TreeNode {
     int data;
     TreeNode left;
     TreeNode right;

     TreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
 }

 *********************************************/
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Solution 
{
    public static List<Integer> getTopView(TreeNode root) 
    {
        //result array list
        List<Integer> arr = new ArrayList<>();

        //if no node is there
        if(root==null)
        {
            return arr;
        }

        //creating a Node class which will maintain the node along with its height
        class Node
        {
            TreeNode node;
            int hd;
            Node(TreeNode node,int hd)
            {
                this.node = node;
                this.hd = hd;
            }
        }

        //queue which will maintain all the nodes
        Queue<Node> queue = new LinkedList<>();

        //add the root along with its height or we can say level.
        queue.add(new Node(root,0));

        //map which will maintain the top element/view of each height
        Map<Integer,TreeNode> map = new TreeMap<>();

        //traverse till the queue is empty
        while(!queue.isEmpty())
        {
            //particular node(node and its height)
            Node temp = queue.poll();
            
            //if map does not contain that height
            if(!map.containsKey(temp.hd))
            {
                map.put(temp.hd,temp.node);
            }

            //checking if the temp node contains the left child and right child
            
            //for left node
            if(temp.node.left!=null)
            {
                queue.add(new Node(temp.node.left, temp.hd-1));
            }
            
            //for right node
            if(temp.node.right!=null)
            {
                queue.add(new Node(temp.node.right, temp.hd+1));
            }
        }

        //now i have the tree map, in which entries are in the sorted format
        
        //traverse the map
        for(Map.Entry<Integer,TreeNode> m : map.entrySet())
        {
            //add the node data in the array list
            arr.add(m.getValue().data);
        }
        
        //return the array list
        return arr;
    }
}
