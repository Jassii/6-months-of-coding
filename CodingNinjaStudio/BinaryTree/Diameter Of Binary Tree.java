/*************************************************************

 Following is the Binary Tree Node structure:

 class TreeNode<T> {
     public T data;
     public BinaryTreeNode<T> left;
     public BinaryTreeNode<T> right;

     TreeNode(T data) {
         this.data = data;
         left = null;
         right = null;
     }
 }

 *************************************************************/

public class Solution 
{
    public static int diameterOfBinaryTree(TreeNode<Integer> root) 
    {
        //if root is null
        if(root==null)
        {
            return 0;
        }
        //left side diameter
        int left = diameterOfBinaryTree(root.left);  
        //right side diameter
        int right = diameterOfBinaryTree(root.right);

        //diameter containing the root node as well...not added 1 as edges is considered
        int d = height(root.left)+height(root.right);
        
        return Math.max(d,Math.max(left,right));
    }
    public static int height(TreeNode<Integer> root)
    {
        if(root==null)
        {
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
}
