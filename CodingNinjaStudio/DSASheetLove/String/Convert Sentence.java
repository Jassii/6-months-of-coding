import java.util.*;
public class Solution 
{
	public static String convertSentence(String str,int n) 
	{
		//array of strings
		String[] num = {"2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","7777","8","88","888","9","99","999","9999"};

		StringBuilder res= new StringBuilder();

		int i;
		for(i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			// if(ch==' ')
			// {
			//     res = res + "0";
			//     continue;
			// }
			int index = ch-'a'; //it will return the index..with the help of that
			//we can take the string
			res.append(num[index]);
		}
		return res.toString();
	}
}
