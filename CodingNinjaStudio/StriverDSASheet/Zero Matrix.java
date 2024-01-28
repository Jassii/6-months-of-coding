import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) 
    {
    	//take 2 dummy array list
        //for row and column separately
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();

        int r = matrix.size();
        int c = matrix.get(0).size();

        //fill the array list with -1 each
        int i,j;
        for(i=0;i<r;i++)
        {
            row.add(-1);
        }
        
        for(i=0;i<c;i++)
        {
            col.add(-1);
        }

        //traverse the matrix
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(matrix.get(i).get(j)==0)
                {
                    row.set(i,0);
                    col.set(j,0);
                }
            }
        }
        
        //traverse the matrix again
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(row.get(i)==0 || col.get(j)==0)
                {
                    matrix.get(i).set(j,0);
                }
            }
        }
        return matrix;
    }
}
