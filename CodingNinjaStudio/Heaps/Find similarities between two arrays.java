import java.util.* ;
import java.io.*;

public class Solution 
{
	
	public static ArrayList<Integer> findSimilarity(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m) 
	{
		Set<Integer> intersection = new HashSet<>();
		Set<Integer> union = new HashSet<>();

		ArrayList<Integer> result = new ArrayList<>();

		int i;

		//below loop will help in finding the common elements from both the array list
		for(i=0;i<n;i++)
		{
			int value = arr1.get(i);
			if(arr2.contains(value))
			{
				intersection.add(value);
			}
		}
		
		//below loops will help in finding the union of both the array lists
		for(i=0;i<n;i++)
		{
			union.add(arr1.get(i));
		}
		for(i=0;i<m;i++)
		{
			union.add(arr2.get(i));
		}

		result.add(intersection.size());
		result.add(union.size());
		
		return result;
	}
}
