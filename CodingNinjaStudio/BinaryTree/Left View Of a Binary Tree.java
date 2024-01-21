import java.util.* ;

import java.io.*; 
/************************************************************

    Following is the TreeNode class structure

    class TreeNode<T> 
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data) 
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

************************************************************/

public class Solution 
{
    public static ArrayList<Integer> getLeftView(TreeNode<Integer> root) 
    {
        ArrayList<Integer> arr = new ArrayList<>();
        
        if(root==null)
        {
            return arr;
        }

        //using level order traversal
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty())
        {
            int n = queue.size();
            
            for(int i=1;i<=n;i++)
            {
                TreeNode<Integer> node = queue.poll();
                
                if(i==1)
                {
                    arr.add(node.data);
                }

                if(node.left!=null)
                {
                    queue.add(node.left);
                }
                if(node.right != null)
                {
                    queue.add(node.right);
                }
            }
        }
        return arr;
    }
}
