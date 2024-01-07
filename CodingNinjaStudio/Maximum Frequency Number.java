import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution 
{
	public static int maxFrequencyNumber(int n, int[] arr) 
	{
		// Write your code here
		int i;

		//taken array list which will help us in getting the index of number
		ArrayList<Integer> alist = new ArrayList<>();
		
		//push all the elements in the map along with their count
		HashMap<Integer,Integer> map = new HashMap<>();

		for(i=0;i<n;i++)
		{
			map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
			alist.add(arr[i]);
		}

		
		//now traverse the map and for the maximum count,
		//maintain the number
		int max = Integer.MIN_VALUE;
		int res=-1;
		for(Map.Entry<Integer,Integer> m : map.entrySet())
		{
			//update max and the number
			if(m.getValue()>max)
			{
				max = m.getValue();
				res = m.getKey();
			}
			//if the count matches then take the element having less index
			else if(m.getValue()==max)
			{
				int k1 = alist.indexOf(res);
				int k2 = alist.indexOf(m.getKey());
				if(k2<k1)
				{
					res = m.getKey();
				}
			}
		}
		return res;
	}
}
