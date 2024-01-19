import java.util.* ;
import java.io.*; 
/****************************************************
class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
	}
}

*****************************************************/
public class Solution 
{
	public static int findMaxDepth(BinaryTreeNode<Integer> root) 
	{
		if(root==null)
		{
			return 0;
		}
		return Math.max(findMaxDepth(root.left),findMaxDepth(root.right))+1;
	}
}
