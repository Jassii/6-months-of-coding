import java.util.*;
public class Solution 
{
	public static int findDuplicate(ArrayList<Integer> arr) 
	{
		int ans=0;
		
		int i;
		//first take the xor of each element 
		for(i=0;i<arr.size();i++)
		{
			ans = ans^arr.get(i);
		}

		//then again xor of the above elements stored in ans
		// with the number from 1 to n-1..
		//at last the only one duplicate element will be there
		for(i=0;i<arr.size();i++)
		{
			ans = ans^i;
		}
		return ans;
	}
}
