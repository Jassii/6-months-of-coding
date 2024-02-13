import java.util.*;

public class Solution 
{
	public static String reverseString(String str) 
	{
		//Write your code here

		//first remove the space at the front and the back
		str = str.trim();
		String arr[] = str.split(" ");
		int i;
		
		StringBuilder ans= new StringBuilder();
		for(i=arr.length-1;i>=0;i--)
		{
			if(!arr[i].equals(""))
			{
				ans = ans.append(arr[i]+ " ");
			}
		}
		String s = ans.toString();
		s = s.trim();
		return s;


		
		//first remove the space at the front and the back
		// str = str.trim();

		// String arr[] = str.split(" ");
		// //traverse the array
		// Stack<String> stack=new Stack<>();
		// int i;
		// for(i=0;i<arr.length;i++)
		// {
		// 	stack.push(arr[i]);
		// }

		// String s="";
		// //pop the strings from the stack
		// while(!stack.isEmpty())
		// {
		// 	s = s + stack.pop() + " ";
		// }
		// return s;


		// String arr[] = str.split(" ");//on the basis of the space
		// //reverse the array
		// int i=0;
		// int j=arr.length-1;
		// while(i<j)
		// {
		// 	String temp = arr[i];
		// 	arr[i]=arr[j];
		// 	arr[j] = temp;
		// 	i++;
		// 	j--;
		// }

		// //convert the array of string into string.
		// String s="";
		// for(i=0;i<arr.length;i++)
		// {
		// 	s = s + arr[i]+" ";
		// }
		// return s;
	}
}
