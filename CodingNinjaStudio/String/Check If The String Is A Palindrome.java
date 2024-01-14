import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static boolean checkPalindrome(String str) 
	{
		//optimal approach
		
		//first convert the string into lower case
		str = str.toLowerCase();
		
		int s=0;
		int l=str.length()-1;
		while(s<l)
		{
			char a = str.charAt(s);
			char b = str.charAt(l);
			
			//now we will check if the characters is a letter or digit
			if(!Character.isLetterOrDigit(a))
			{
				s++;
			}
			else if(!Character.isLetterOrDigit(b))
			{
				l--;
			}
			else
			{
				if(a!=b)
				{
					return false;
				}
				s++;
				l--;
			}
		}
		return true;


		// ===============================BASIC APPROACH=====================================
		//convert the string into lower case
		// str = str.toLowerCase();

		// //now traverse the string and remove white spaces and symbols
		// String str1=""; //empty string

		// int i;
		// for(i=0;i<str.length();i++)
		// {
		// 	char ch = str.charAt(i);
		// 	//if the charcter is an alphabet or number then append
		// 	if((ch>='a' && ch<='z') || ch>='0'&& ch<='9')
		// 	{
		// 		str1 = str1 + String.valueOf(ch);
		// 	}
		// }

		// //now i have the new string (removed spaces and symbols)

		// i=0;
		// int j=str1.length()-1;
		// while(i<j)
		// {
		// 	if(str1.charAt(i)!=str1.charAt(j))
		// 	{
		// 		return false;
		// 	}
		// 	i++;
		// 	j--;
		// }
		// return true;
	}
}
