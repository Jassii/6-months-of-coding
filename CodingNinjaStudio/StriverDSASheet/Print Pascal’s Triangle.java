import java.util.*;
public class Solution 
{
    public static int[][] pascalTriangle(int N) 
    {
        //final array to be returned
        int triangle[][] = new int[N][N];

        int i,j;
        for(i=0;i<N;i++)
        {
            //creating sub array again and again of different sizes
            int temp[] = new int[i+1];

            //filling values in the temp array
            for(j=0;j<=i;j++)
            {
                //for first and last index in the sub array
                if(j==0 || j==i)
                {
                    temp[j]=1;
                }
                else
                {
                    temp[j] = triangle[i-1][j-1] + triangle[i-1][j];
                }
                
            }
            //at the sub array in the main 2d array
            triangle[i] = temp;
        }   
        //return the 2d array
        return triangle;

        

        // int triangle[][] = new int[N][];
        
        // triangle[0][0] = 1; //always be 1..

        // //now will be filling values from 1st row
        // int i;
        // for(i=1;i<N;i++)
        // {
        //     //first element in the array is 1 and last element is also 1.
        //     triangle[i][0] = 1;

        //     //for middle elements
        //     int j;
        //     for(j=1;j<i;j++)
        //     {   
        //         triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
        //     }

        //     //last element will also be 1 as written above
        //     triangle[i][i] = 1;
        // }
        // return triangle;
    }
}
