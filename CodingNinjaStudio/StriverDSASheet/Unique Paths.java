import java.util.* ;
import java.io.*; 
public class Solution {
	public static int uniquePaths(int m, int n) 
	{
		// Write your code here.
		
		//call the function passing its (0,0) index positions..
		return countPaths(0,0,m,n);
	}

	public static int countPaths(int i,int j,int m,int n)
	{
		//some base conditions

		//reached to the destination
		if(i==m-1 && j==n-1)
		{
			return 1;
		}
		
		//if it crossed the matrix
		if(i>=m || j>=n)
		{
			return 0;
		}

		//recursive call
		return countPaths(i+1, j, m, n) + countPaths(i, j+1, m, n);
	}
}
