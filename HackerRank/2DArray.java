import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

    //..Main solution...
      
        int maxSum = Integer.MIN_VALUE;
        int i,j;
        for(i=0;i<=3;i++)
        {
            
            for(j=0;j<=3;j++)
            {
              //take the sum of the values which comes in the hourglass structure
                int currentSum = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2) + arr.get(i+1).get(j+1) + arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
                
                if(currentSum>maxSum)
                {
                    maxSum = currentSum;
                } 
            }
           
        }
        System.out.println(maxSum);  //return maxSum..
        
        bufferedReader.close();
    }
}
