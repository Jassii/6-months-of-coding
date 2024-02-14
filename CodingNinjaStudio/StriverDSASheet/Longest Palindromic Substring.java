import java.util.*;
public class Solution 
{	
	public static String longestPalinSubstring(String str) 
	{
		//optimized approach
		
		String LPS="";
		int i;
		for(i=1;i<str.length();i++)
		{
			//for odd length
			int low=i;
			int high=i;

			//move low to left and high to right, till it matches
			while(str.charAt(low)==str.charAt(high))
			{
				low--;
				high++;

				//for the break condition (low or high reaches to the edges)
				if(low==-1 || high==str.length())
				{
					break;
				}
			}

			//now form the palindrome string using low and high
			String palin = str.substring(low+1,high);

			//if the above palin string is greater then update the string
			if(palin.length()>LPS.length())
			{
				LPS=palin;
			}

			//for even length 
			low=i-1;
			high=i;

			//find the palindrome string
			while(str.charAt(low)==str.charAt(high))
			{
				low--;
				high++;

				if(low==-1 || high==str.length())
				{
					break;
				}
			}

			palin = str.substring(low+1, high);
			
			//maintain the largest substring
			if(palin.length()>LPS.length())
			{
				LPS=palin;
			}
		}
		return LPS;



		// String res="";
		// int max=Integer.MIN_VALUE;
		
		// //finding the substrings of the above string
		// int i,j;
		// for(i=0;i<str.length();i++)
		// {
		// 	for(j=i+1;j<=str.length();j++)
		// 	{
		// 		//take the substring from i to j..
		// 		String sub = str.substring(i,j);
				
		// 		//now i have got the substring..check if its palindrome
		// 		boolean palin=checkPalin(sub);
				
		// 		//now a palindrome substring
		// 		if(palin==true)
		// 		{
		// 			int len = sub.length();
		// 			if(len>max)
		// 			{
		// 				max=len; //maintaining the length of the substring
		// 				res=sub; //can be the longest palindrome substring
		// 			}
		// 		}
		// 	}
		// }
		// return res;
	}

	// public static boolean checkPalin(String s)
	// {
	// 	//convert the string into character array
	// 	char ch[] = s.toCharArray();
	// 	int l=0;
	// 	int r=ch.length-1;
	// 	while(l<r)
	// 	{
	// 		if(ch[l]==ch[r])
	// 		{
	// 			l++;
	// 			r--;
	// 		}
	// 		else
	// 		{
	// 			return false;
	// 		}
	// 	}
	// 	return true;
	// }
}
