/*********************************************************

 Following is the TreeNode structure:

 class TreeNode {
     int data;
     TreeNode left;
     TreeNode right;
     TreeNode() {
         this.data = 0;
         this.left = null;
         this.right = null;
     }
     TreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
     TreeNode(int data, TreeNode left, TreeNode right) {
         this.data = data;
         this.left = left;
         this.right = right;
     }
 };
 ********************************************************/

import java.util.*;
public class Solution 
{
    public static List<List<Integer>> getTreeTraversal(TreeNode root) 
    {
        //taken the final array list
        List<List<Integer>> res_traverse = new ArrayList<>();

        //list maintaining inOrder, preOrder, postOrder traversal
        List<Integer> in = new ArrayList<>();        
        List<Integer> pre = new ArrayList<>();  
        List<Integer> post = new ArrayList<>();

        //function for traversal
        inOrder(root,in);
        preOrder(root, pre);
        postOrder(root, post);

        //adding the list in the final result array list
        res_traverse.add(in);
        res_traverse.add(pre);
        res_traverse.add(post);
        
        return res_traverse;
    }

    //inorder traversal
    public static void inOrder(TreeNode root,List<Integer> res)
    {
        if(root==null)
        {
            return;
        }

        inOrder(root.left, res,a);
        res.add(root.data);
        inOrder(root.right, res, a);
        
        return;
    }

    //preorder traversal
    public static void preOrder(TreeNode root,List<Integer> res)
    {
        if(root==null)
        {
            return;
        }

        res.add(root.data);
        preOrder(root.left, res);
        preOrder(root.right, res);

        return;
    }

    //postorder traversal
    public static void postOrder(TreeNode root,List<Integer> res)
    {
        if(root==null)
        {
            return;
        }

        postOrder(root.left, res);
        postOrder(root.right, res);
        res.add(root.data);

        return;
    }
}
