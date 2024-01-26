import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
	public static ArrayList<Integer> countTheNumber(ArrayList<Integer> arr, int n, int k) 
	{

		//taking the hashmap which will store the value and its count..
        HashMap<Integer,Integer> map = new HashMap<>();
		int i;
		for(i=0;i<n;i++)
		{
			map.put(arr.get(i),map.getOrDefault(arr.get(i),0)+1);
		}

		ArrayList<Integer> res = new ArrayList<>();
		//now i will traverse the map and compare the value..
		//if the value is greater than n/k then increase the result count..
		for(Map.Entry<Integer,Integer> m : map.entrySet())
		{
			if(m.getValue()>=(n/k))
			{
				res.add(m.getKey());
			}
		}
		return res;
	}
}
