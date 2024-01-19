/*********************************************************

 Following is the BinaryTreeNode structure:

 class BinaryTreeNode {
     int data;
     BinaryTreeNode left;
     BinaryTreeNode right;
     BinaryTreeNode() {
         this.data = 0;
         this.left = null;
         this.right = null;
     }
     BinaryTreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
     BinaryTreeNode(int data, BinaryTreeNode left, BinaryTreeNode right) {
         this.data = data;
         this.left = left;
         this.right = right;
     }
 };
 ********************************************************/

public class Solution 
{
    public static boolean searchInBST(BinaryTreeNode root, int x) 
    {
      //if it reaches at the end position
        if(root==null)
        {
            return false;
        }
      //when the data matches to the x
        if(root.data==x)
        {
            return true;
        }

      //checking if the data falls at left side
        if(x<root.data)
        {
            return searchInBST(root.left, x);
        }
        else //if data lies at the right side
        {
            return searchInBST(root.right, x);
        }
    }
}
