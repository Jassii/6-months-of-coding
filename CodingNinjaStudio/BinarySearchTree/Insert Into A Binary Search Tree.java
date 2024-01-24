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

        if(root==null)
        {
            root = new TreeNode(val);
            return root;
        }

        if(val<root.val)
        {
            root.left = insertionInBST(root.left,val);
        }
        if(val>root.val)
        {
            root.right = insertionInBST(root.right,val);
        }

        return root;
    }
}
