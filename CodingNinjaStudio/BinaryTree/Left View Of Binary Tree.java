import java.util.*;

/*************************************************************

     Following is thr TreeNode class structure

     class BinaryTreeNode<T>
     {
         T data;
         BinaryTreeNode<T> left;
         BinaryTreeNode<T> right;

         BinaryTreeNode(T data) {
             this.data = data;
             left = null;
             right = null;
         }
     };

 *************************************************************/
public class Solution 
{
    public static void printLeftView(TreeNode<Integer> root) 
    {
        if(root==null)
        {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        //traverse the binary tree(level order traversal)
        //print only the first node level by level
        while(!queue.isEmpty())
        {
            //get the size of queue and traverse till n
            int n = queue.size();
            for(int i=1;i<=n;i++)
            {
                TreeNode temp = queue.poll(); //get the node
                //check if i is equal to 1 i.e. first node
                if(i==1)
                {
                    System.out.print(temp.data+" ");
                }
                //for the left node
                if(temp.left!=null)
                {
                    queue.add(temp.left);
                }
                //for right node
                if(temp.right!=null)
                {
                    queue.add(temp.right);
                }
            }
        }
        return;
    }
}
