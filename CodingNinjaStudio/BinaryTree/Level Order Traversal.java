import java.util.* ;
import java.io.*; 
/*

	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T val;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

*/
public class Solution 
{

  public static ArrayList<Integer> getLevelOrder(BinaryTreeNode root) 
  {
	  //taking the help of queue
    Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
	
	//result array list
	ArrayList<Integer> res = new ArrayList<>();

	//if no node is there..then simply return the empty array list
	if(root==null)
	{
		return res;
	}
	
	q.add(root);
	//until queue is empty
	while(!q.isEmpty())
	{
		BinaryTreeNode node = q.poll();
		//add the value in the array list
		res.add(node.val);

		//check for left and right nodes.
		if(node.left!=null)
		{
			q.add(node.left);
		}
		if(node.right!=null)
		{
			q.add(node.right);
		}
	}
	//at last return the result array list
	return res;
  }
}
