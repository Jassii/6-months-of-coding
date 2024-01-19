import java.util.LinkedList;
import java.util.*;
// import com.sun.tools.javac.util.Pair;

/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/



/*

	Representation of the Pair Class

	class Pair<T, U> {
		T minimum;
		U maximum;

		public Pair(T minimum, U maximum) {
			this.minimum = minimum;
			this.maximum = maximum;
		}

	}

*/

public class Solution {

  //function to find the minimum value from the binary tree
	public static int minimum(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return Integer.MAX_VALUE;
		}
		return Math.min(root.data,Math.min(minimum(root.left),minimum(root.right)));
	}
  //function to find the maximum of Binary tree
	public static int maximum(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return Integer.MIN_VALUE;
		}
		return Math.max(root.data,Math.max(maximum(root.left),maximum(root.right)));
	}

	public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) 
	{

		int max = maximum(root);
		int min = minimum(root);
    //create a pair
		Pair<Integer,Integer> pair = new Pair<>(min,max);
    //return it.
		return pair;

		// int min = Integer.MAX_VALUE;
		// int max = Integer.MAX_VALUE;

		// will be doing level order traversal
		//and will find max and min value
		// Queue<BinaryTreeNode> queue = new LinkedList<>();
		// queue.add(root);

		// while(!queue.isEmpty())
		// {
		// 	BinaryTreeNode node = queue.poll();
			
		// 	min = Math.min(min,node.data);
		// 	max = Math.max(max,node.data);
			
		// 	if(node.left!=null)
		// 	{
		// 		queue.add(node.left);
		// 	}
		// 	if(node.right!=null)
		// 	{
		// 		queue.add(node.right);
		// 	}
		// }
		// //now i would have got min and max value
		// Pair<Integer,Integer> pair = new Pair<>(min,max);
		// return pair;
	}	
}
