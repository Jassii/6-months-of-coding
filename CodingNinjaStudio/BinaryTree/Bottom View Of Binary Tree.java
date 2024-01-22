/*********************************************

 Following is the TreeNode class structure

 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
    
     TreeNode(int val) {
         this.val = val;
         this.left = null;
         this.right = null;
     }
 }

 *********************************************/

import java.util.*;


public class Solution 
{

    static class Node
    {
        int hd;
        TreeNode node;
        Node(int hd,TreeNode node)
        {
            this.hd=hd;
            this.node=node;
        }
    }
    public static List<Integer> bottomView(TreeNode root) 
    {
        List<Integer> arr = new ArrayList<>();
        
        if(root==null)
        {
            return arr;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(0, root));

        Map<Integer,TreeNode> map = new TreeMap<>();
        
        while(!queue.isEmpty())
        {
            Node temp = queue.poll();
          
          //update the value present at the height
            map.put(temp.hd,temp.node);
          
            if(temp.node.left!=null)
            {
                queue.add(new Node(temp.hd-1, temp.node.left));
            }
            if(temp.node.right!=null)
            {
                queue.add(new Node(temp.hd+1, temp.node.right));
            }
        }
        //traverse the map
        for(Map.Entry<Integer,TreeNode> m : map.entrySet())
        {
            arr.add(m.getValue().val);
        }
        return arr;
    }
}
