import java.util.* ;
import java.io.*; 
import java.util.ArrayList;


public class Solution 
{
	public static ArrayList<Integer> countDistinctElements(ArrayList<Integer> arr, int k) 
	{
		//basic approach(will get fail in TLC)
		
		// int i,j;
		// ArrayList<Integer> result = new ArrayList<>();
		// for(i=0;i<=arr.size()-k;i++)
		// {
		// 	HashSet<Integer> set = new HashSet<>();
		// 	for(j=i;j<i+k;j++)
		// 	{
		// 		set.add(arr.get(j));
		// 	}
		// 	result.add(set.size());
		// }
		// return result;

		//optimized approach (Using HasMaps)

		int i;
		HashMap<Integer,Integer> map = new HashMap<>();
		ArrayList<Integer> res = new ArrayList<>(); //which we have to return

		//first push k elements with its count in map
		for(i=0;i<k;i++)
		{
			map.put(arr.get(i),map.getOrDefault(arr.get(i), 0)+1);
		}

		res.add(map.size()); //push the size of the map in the result array list

		for(i=k;i<arr.size();i++)
		{
			//remove the first element of the k size list
			int value = map.get(arr.get(i-k));
			if(value==1)
			{
				map.remove(arr.get(i-k));
			}
			else
			{
				map.put(arr.get(i-k), value-1);
			}

			//add next element in the k size list.
			map.put(arr.get(i), map.getOrDefault(arr.get(i), 0)+1);

			//now add the size of the map
			res.add(map.size());
		}
		return res;
	}
}
