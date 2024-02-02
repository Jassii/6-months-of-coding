import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static void inplaceRotate(int[][] arr, int n) 
	{

    //optimized approach
		//first step is to reverse each row
		int i,j;
		for(i=0;i<arr.length;i++)
		{
			int s = 0;
			int l = arr[0].length-1;
			while(s<l)
			{
				int temp = arr[i][s];
				arr[i][s] = arr[i][l];
				arr[i][l] = temp;
				s++;
				l--;
			}
		}

		//now do the transpose of the array
		for(i=0;i<arr.length-1;i++)
		{
			for(j=i+1;j<arr[0].length;j++)
			{
				if(i!=j)
				{
					//swap the elements
					int temp = arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i] = temp;
				}
			}
		}


    //brute force approach
    //brute force approach.
		// ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		// int i,j;
		// for(i=0;i<matrix.size();i++)
		// {
		// 	ArrayList<Integer> a = new ArrayList<>();
		// 	for(j=0;j<matrix.get(0).size();j++)
		// 	{
		// 		a.add(-1);
		// 	}
		// 	arr.add(a);
		// }
		
		// //traversing the given 2d matrix
		// int k;
		// for(i=0;i<matrix.size();i++) 
		// {
		// 	k=0; //row
		// 	for(j=matrix.size()-1;j>=0;j--)  
		// 	{
		// 		int value = matrix.get(i).get(j);
		// 		arr.get(k).set(i,value);
		// 		k++;
		// 	}
		// }
    
	}
}
