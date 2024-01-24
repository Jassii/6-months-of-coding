/*********************************************************

 Following is the TreeNode structure:

 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {
         this.val = 0;
         this.left = null;
         this.right = null;
     }
     TreeNode(int val) {
         this.val = val;
         this.left = null;
         this.right = null;
     }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 };
 ********************************************************/

public class Solution 
{
    public static TreeNode insertionInBST(TreeNode root, int val) 
    {
        // =============OPTIMIZED APPROACH (O(log n))===========================================================
        //i will traverse the binary search tree just like binary search
        TreeNode curr = root;
        TreeNode parent = null;

        while(curr!=null)
        {
            //maintain the parent
            parent = curr;
            if(val<curr.val)
            {
                curr = curr.left;
            }
            else if(val>curr.val)
            {
                curr = curr.right;
            }
        }

        //when curr reaches the null position
        //there can be a chance that parent is not updated(when the
        // tree is empty).
        if(parent==null)
        {
            return new TreeNode(val);
        }

        //parent is updated
        if(val<parent.val)
        {
            parent.left = new TreeNode(val);
        }
        else if(val>parent.val)
        {
            parent.right = new TreeNode(val);
        }
        return root;

// =====================O(h)====================================================
        // if(root==null)
        // {
        //     root = new TreeNode(val);
        //     return root;
        // }

        // if(val<root.val)
        // {
        //     root.left = insertionInBST(root.left,val);
        // }
        // if(val>root.val)
        // {
        //     root.right = insertionInBST(root.right,val);
        // }

        // return root;
    }
}
