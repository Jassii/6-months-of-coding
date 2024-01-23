import java.util.* ;
import java.io.*; 
/************************************************************

	Following is the Binary Tree node structure:

	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
	        this.data = data;
	    }
	}

************************************************************/
class Node
{
	int hd;
	BinaryTreeNode node;
	Node(BinaryTreeNode node, int hd)
	{
		this.hd=hd;
		this.node=node;
	}
}

public class Solution 
{
    public static int minDepth(BinaryTreeNode<Integer> root) 
	{
		//if root is null
		if(root==null)
		{
			return 0;
		}

		//will be doing level order traversal
		Queue<Node> queue = new LinkedList<>();
		queue.add(new Node(root,1));

		//traverse till queue is empty
		while(!queue.isEmpty())
		{
			int n = queue.size();
			for(int i=1;i<=n;i++)
			{
				Node temp = queue.poll();

				//if left child and right child is null
				//reaches to the leaf node
				if(temp.node.left==null && temp.node.right==null)
				{
					return temp.hd;
				}

				//if left side is not null
				if(temp.node.left!=null)
				{
					queue.add(new Node(temp.node.left,temp.hd+1));
				}
				if(temp.node.right!=null)
				{
					queue.add(new Node(temp.node.right,temp.hd+1));
				}
			}
		}
	return 0;


// ==============ANOTHER METHOD RECURSION==========================================================

		//if root is null
		// if(root==null)
		// {
		// 	return 0;
		// }

		// //we have found the leaf node
        // if(root.left==null && root.right==null)
		// {
		// 	return 1;
		// }
		// if(root.left==null)
		// {
		// 	return 1+minDepth(root.right);
		// }
		// if(root.right==null)
		// {
		// 	return 1+minDepth(root.left);
		// }

		// return Math.min(minDepth(root.left),minDepth(root.right))+1;
    }
}
